package tripmaster.common.attraction;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

import tripmaster.common.location.LocationData;

public class AttractionDistanceTest {

	@Test
	public void givenCloserLocation_whenCompareTo_thenReturnsLessThanZero() {
		// GIVEN
		LocationData location = new LocationData();
		AttractionData attractionClose = new AttractionData(new UUID(0,0), "", "", "", 1, 2);
		AttractionDistance attractionDistanceClose = new AttractionDistance(location, attractionClose);
		AttractionData attractionFar = new AttractionData(new UUID(0,0), "", "", "", 3, 4);
		AttractionDistance attractionDistanceFar = new AttractionDistance(location, attractionFar);
		// WHEN
		int result = attractionDistanceClose.compareTo(attractionDistanceFar);
		// THEN
		assertTrue(result<0);
	}

	@Test(expected = RuntimeException.class)
	public void givenLocationWithDifferentReferences_whenCompareTo_thenThowsRuntimeException() {
		// GIVEN
		LocationData location1 = new LocationData(1, 2);
		LocationData location2 = new LocationData(3, 4);
		AttractionData attractionClose = new AttractionData(new UUID(0,0), "", "", "", 0, 0);
		AttractionDistance attractionDistanceClose = new AttractionDistance(location1, attractionClose);
		AttractionData attractionFar = new AttractionData(new UUID(0,0), "", "", "", 1000, 2000);
		AttractionDistance attractionDistanceFar = new AttractionDistance(location2, attractionFar);
		// WHEN
		attractionDistanceClose.compareTo(attractionDistanceFar);
		// THEN throws RuntimeException
	}
}
