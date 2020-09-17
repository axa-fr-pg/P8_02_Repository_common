package tripmaster.common.user;

import tripmaster.common.attraction.AttractionData;

/**
 * Data structure containing information for a user and attraction pair
 * @see tripmaster.tourguide.api.RewardRequestServiceImpl
 */
public class UserAttraction {
	
	public User user;
	public AttractionData attraction;
	
	public UserAttraction(User user, AttractionData attraction) {
		this.user = user;
		this.attraction = attraction;
	}
	
	public UserAttraction() {
	}
}
