package alerter.stubs;
public class NetworkAlertStub {
    static final int THRESHOLD = 200;
    public static int mockNetworkAlerts(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        // Return 200 for ok
        // Return 500 for not-ok
        if(celcius>=THRESHOLD) {
        	return 500;
        }
        return 200;
    }
}
