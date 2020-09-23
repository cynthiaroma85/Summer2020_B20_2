package day51_Exceptions.BrowserTask;

public class ChromeBrowser extends WebDriver {  // extend to inhert methods from SUperClass
                                    // to add new implementacion//also to save memory


      /*
    get(url), close()
     */

    @Override  //? if there is not compile error // that means is overriding
    public void get(String url){
        System.out.println("Opening the "+url+" in chrome browser");
    }

    public void close(){
        System.out.println("closing the chrome browser");
    }


}
