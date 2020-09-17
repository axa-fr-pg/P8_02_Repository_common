package tripmaster.common.user;

public class UserPreferences {
	
	public int attractionProximity = Integer.MAX_VALUE;
	public double lowerPricePoint = 0;
	public double highPricePoint = Double.MAX_VALUE;
	public int tripDuration = 1;
	public int ticketQuantity = 1;
	public int numberOfAdults = 1;
	public int numberOfChildren = 0;
	
	public UserPreferences() {
	}
}
