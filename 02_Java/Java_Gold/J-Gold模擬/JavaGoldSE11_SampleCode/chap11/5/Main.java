import java.util.*;

public class Main {
  public static void main(String[] args) {
    Locale japan = Locale.getDefault(); // デフォルト（日本）
    Locale us = new Locale("en", "US"); // 米国
    Locale[] locArray = {japan, us};
    for(Locale locale : locArray){
      ResourceBundle obj1
            = ResourceBundle.getBundle("MyResources", locale);
      System.out.println("send   : " + obj1.getString("send"));
      System.out.println("cancel : " + obj1.getString("cancel"));
    }
  }
}
