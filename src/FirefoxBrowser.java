public class FirefoxBrowser implements ParentBrowser{

    public FirefoxBrowser() {
        System.out.println("Launching Firefox browser...");
    }
    @Override
    public void goTo(String URL) {
        System.out.println("Starting Firefox browser...");
    }

    @Override
    public void getCurrentURL() {
        System.out.println("Launching URL...");
    }

    @Override
    public void getTitle() {
        System.out.println("Getting the title...");
    }

    @Override
    public void close() {
        System.out.println("Closing the browser");
    }
}
