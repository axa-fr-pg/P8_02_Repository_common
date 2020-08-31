package tripmaster.common.user;

import tripmaster.common.attraction.AttractionData;
import tripmaster.common.location.VisitedLocationData;

public class UserReward {

	public VisitedLocationData visitedLocation;
	public AttractionData attraction;
	public int rewardPoints;
	
	public UserReward(VisitedLocationData visitedLocation, AttractionData attraction, int rewardPoints) {
		this.visitedLocation = visitedLocation;
		this.attraction = attraction;
		this.rewardPoints = rewardPoints;
	}
	
	public UserReward() {
	}
}
