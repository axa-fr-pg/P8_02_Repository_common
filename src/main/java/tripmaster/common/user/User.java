package tripmaster.common.user;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import tripmaster.common.location.VisitedLocationData;

/**
 * Data structure containing information for a User
 */
public class User {
	public final UUID userId;
	public final String userName;
	public String phoneNumber;
	public String emailAddress;
	public UserPreferences userPreferences;
	private List<VisitedLocationData> visitedLocations;
	private List<UserReward> userRewards;
	
	public User(UUID userId, String userName, String phoneNumber, String emailAddress) {
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		visitedLocations = new ArrayList<>();
		userRewards = new ArrayList<>();
		userPreferences = new UserPreferences();
	}
	
	public User() {
		this(new UUID(0,0), new String(), new String(), new String());
	}	

	public void addToVisitedLocations(VisitedLocationData visitedLocation) {
		visitedLocations.add(visitedLocation);
	}
	
	public List<VisitedLocationData> getVisitedLocations() {
		return visitedLocations;
	}
	
	/**
	 * Get the user's last visited location.
	 * @return the location which has been added lastly to the user's visited location list
	 * If the list is empty, returns null.
	 */
	public VisitedLocationData getLastVisitedLocation() {
		int listLength = visitedLocations.size();
		if (listLength == 0) {
			return null;
		}
		return visitedLocations.get(listLength - 1);
	}
	
	/**
	 * Adds a reward the the user's reward list, if the user hasn't been rewarded for the same attraction yet.
	 * @param userReward to be added
	 */
	public void addUserReward(UserReward userReward) {
		// Check attraction name to assess if a reward has already been granted for the attraction
		if(userRewards.stream().filter(r -> r.attraction.name.equals(userReward.attraction.name)).count() == 0) {
			userRewards.add(userReward);
		}
	}
	
	public List<UserReward> getUserRewards() {
		return userRewards;
	}	
}
