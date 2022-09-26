import java.util.ResourceBundle;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    Locale japan = Locale.getDefault(); // デフォルト（日本）
    Locale us = Locale.US;            // 米国
    Locale[] locArray = {japan, us};
    for(Locale locale : locArray){
      ResourceBundle obj1
            = ResourceBundle.getBundle("com.se.MyResources", locale);
        System.out.println("send   : " + obj1.getString("send"));
        System.out.println("cancel : " + obj1.getString("cancel"));
    }
    ResourceBundle obj2
            = ResourceBundle.getBundle("com.se.MyResources");
    System.out.println("検証用 : " + obj2.getString("send"));
  }
}
