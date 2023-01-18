package Class15;

public class FluentWaitWebDriver {
    public static void main(String[] args) {
        FluentWaitWebDriver fluentWait = new FluentWaitWebDriver();
        //var fluentWait = new FluentWaitWebDriver(); <-- this is the exact same as above line

        fluentWait.printHello();
    }

    public void printHello() {
        System.out.println("Hello");
    }
}
