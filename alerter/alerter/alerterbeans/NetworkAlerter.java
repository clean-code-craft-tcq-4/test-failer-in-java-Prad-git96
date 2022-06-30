package alerter.alerterbeans;

import alerter.services.NetworkAlerterService;
import alerter.stubs.NetworkAlertStub;

public class NetworkAlerter{ 
	NetworkAlerter(){
		
	}
	
	public static NetworkAlerterService getNetworkAlerter() {	  
		 return new NetworkAlertStub();
	}
}
