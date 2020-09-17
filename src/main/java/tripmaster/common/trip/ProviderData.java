package tripmaster.common.trip;

import java.util.UUID;

/**
 * Data structure containing information for a provider
 * @see tripPricer.Provider
 *
 */
public class ProviderData {
	
	  public String name;
	  public double price;
	  public UUID tripId;
	  
	  public ProviderData(String attractionName, double attractionPrice, UUID idTrip) {
		  name = attractionName;
		  price = attractionPrice;
		  tripId = idTrip;
	  }
	  
	  public ProviderData() {		  
	  }
}
