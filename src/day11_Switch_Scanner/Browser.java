package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        String browserName = "chrome";


        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName =="firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";

        if ((validBrowser)){
            // 5 options
       if (browserName== "chrome"){
           result = "Chrome Browser is Selected";
       }else if (browserName== "FireFox"){
           result = "FireFox Browser is Selected";
       }else if(browserName == "Opera" ){
           result =  "Opera Browser is Selected";
       }else if (browserName == "Safari"){
           result = " Safari Browser is Selected";
       }else {
           result = "Edge Browser is Selected";
       }


        }else{
            result = "Invalid Browser Name";
        }

        System.out.println(result);

























    }


















}
