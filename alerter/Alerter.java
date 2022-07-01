import alerter.alerterbeans.NetworkAlerter;

public class Alerter {
    static int alertFailureCount = 0;
   
    static void alertInCelcius(float farenheit) {
        float celcius = (farenheit - 32) * 5 / 9;
       
        int returnCode = NetworkAlerter.getNetworkAlerter().getNetworkAlerts(celcius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 1;
        }
    }
    public static void main(String[] args) {
        alertInCelcius(-15f);
        assert(alertFailureCount==0);
        alertInCelcius(0f);
        assert(alertFailureCount==0);
        alertInCelcius(303.6f);
        assert(alertFailureCount==0);
        alertInCelcius(392f);
        assert(alertFailureCount==1);
        alertInCelcius(400.5f);
        assert(alertFailureCount==2);      
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        assert(alertFailureCount==2);      
        System.out.println("All is well!\n");
    }
}
