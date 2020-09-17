package tripmaster.common.attraction;

import tripmaster.common.location.LocationData;

/**
 * Class for the comparison of attraction distances.
 * @see tripmaster.common.attraction.AttractionData
 *
 */
public class AttractionDistance extends AttractionData implements Comparable<AttractionDistance> {

	private LocationData fromLocation;
	
	public AttractionDistance(LocationData fromLocation, AttractionData toAttraction) {
		super(toAttraction.id, toAttraction.name, toAttraction.city, toAttraction.state,
				toAttraction.latitude, toAttraction.longitude);
		this.fromLocation = fromLocation;
	}
	
	/**
	 * Compares two attractions if they are based on the same reference location.
	 * @param that another AttractionDistance 
	 * @throws RuntimeException if the method is called for AttractionDistance instances with different reference location
	 * @return integer value based on the comparison of the distances. 
	 * Zero if both AttractionDistance instances have the same distance from the reference location. 
	 * Less than zero if the main instance (this) is closer to the reference location than the other instance (that).
	 * More than zero in the opposite case.
	 */
	@Override
	public int compareTo(AttractionDistance that) {
		// Check that we are comparing to the same reference
		if (this.fromLocation.latitude != that.fromLocation.latitude
				|| this.fromLocation.longitude != that.fromLocation.longitude) {
			throw new RuntimeException("Trying to compare attractions based on different origins");
		}
		// Return the comparison result
		double distanceToThis = this.fromLocation.getDistance(new LocationData(this.latitude, this.longitude));
		double distanceToThat = that.fromLocation.getDistance(new LocationData(that.latitude, that.longitude));
		return Double.valueOf(distanceToThis).compareTo(Double.valueOf(distanceToThat));
	}
}
