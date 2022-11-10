public class TestClass {

    public static void main(String[] args) {
        ParentBrowser chrome = new ChromeBrowser();
        chrome.goTo("https://www.google.com");
        chrome.getTitle();

        chrome.close();
    }

}
