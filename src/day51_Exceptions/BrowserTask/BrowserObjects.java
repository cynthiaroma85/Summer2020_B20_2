package day51_Exceptions.BrowserTask;

public class BrowserObjects {


    public static void main(String[] args) {

        //OBJECT allways decided wich implementacion will be EXECUTED
        // SAME access modifier must be same or more Visible!
        // public > protected > default > private  level of VISIBOTILTY!

        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("https://www.google.com/");
        chrome.close();

        System.out.println("=====================================");

        FireFoxBrowser firefox = new FireFoxBrowser();
        firefox.get("https://www.google.com/");
        firefox.close();

        System.out.println("=====================================");

        OperaBrowser opera = new OperaBrowser();
        opera.get("https://www.google.com/");
        opera.close();



    }


}
