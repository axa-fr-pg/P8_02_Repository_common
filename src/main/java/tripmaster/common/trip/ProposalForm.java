package tripmaster.common.trip;

import java.util.List;

import tripmaster.common.attraction.AttractionNearby;
import tripmaster.common.user.User;

/**
 * Data structure containing information for a holiday proposal
 * @see tripmaster.tourguide.api.TripRequestServiceImpl
 *
 */
public class ProposalForm {
	public User user;
	public List<AttractionNearby> attractions;
	public int cumulativeRewardPoints;
	
	public ProposalForm(User user, List<AttractionNearby> attractions, int cumulativeRewardPoints) {
		this.user = user;
		this.attractions = attractions;
		this.cumulativeRewardPoints = cumulativeRewardPoints;
	}
	
	public ProposalForm() {
	}
}
