public class SimpleClient {
    public static void main(String[] args) {
        MarriageProxy proxy = new MarriageProxy("金利来");
        proxy.contactBachelor();
        proxy.getRealBachelor().claimSexualOrientation();
        proxy.findAMate();
        proxy.setMarriage();
        proxy.getRealBachelor().findAMate();
    }
}
