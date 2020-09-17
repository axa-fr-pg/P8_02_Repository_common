package tripmaster.common.user;

import java.util.List;

import tripmaster.common.attraction.AttractionData;

/**
 * Data structure containing information for a user list and attraction list pair
 * @see tripmaster.tourguide.api.RewardRequestServiceImpl
 */
public class UserAttractionLists {

	public List<AttractionData> attractionList;
	public List<User> userList;
	
	public UserAttractionLists(List<AttractionData> attractions, List<User> userList) {
		this.attractionList = attractions;
		this.userList = userList;
	}
	
	public UserAttractionLists() {
	}
}
