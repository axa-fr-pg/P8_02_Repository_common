package tripmaster.common.user;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;

import tripmaster.common.location.LocationData;
import tripmaster.common.location.VisitedLocationData;

public class UserTest {

	@Test
	public void givenUser_whenGetLastVisitedLocation_thenReturnsCorrectLocation () {
		// GIVEN
		User user = new User();
		VisitedLocationData visitedLocation1 = new VisitedLocationData(new UUID(0,0), new LocationData(), new Date());
		VisitedLocationData visitedLocation2 = new VisitedLocationData(new UUID(0,0), new LocationData(), new Date());
		user.addToVisitedLocations(visitedLocation1);
		user.addToVisitedLocations(visitedLocation2);
		// WHEN
		VisitedLocationData lastVisitedLocation = user.getLastVisitedLocation();
		// THEN
		assertEquals(visitedLocation2, lastVisitedLocation);
	}
	
	@Test
	public void givenUserWithoutVisitedLocation_whenGetLastVisitedLocation_thenReturnsNull () {
		// GIVEN
		User user = new User();
		// WHEN
		VisitedLocationData lastVisitedLocation = user.getLastVisitedLocation();
		// THEN
		assertEquals(null, lastVisitedLocation);
	}
}
