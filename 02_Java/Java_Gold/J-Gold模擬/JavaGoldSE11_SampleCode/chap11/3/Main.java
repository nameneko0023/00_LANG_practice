import java.util.ResourceBundle;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    Locale japan = Locale.getDefault(); // �f�t�H���g�i���{�j
    Locale us = Locale.US;            // �č�
    Locale[] locArray = {japan, us};
    for(Locale locale : locArray){
      ResourceBundle obj1
            = ResourceBundle.getBundle("com.se.MyResources", locale);
        System.out.println("send   : " + obj1.getString("send"));
        System.out.println("cancel : " + obj1.getString("cancel"));
    }
    ResourceBundle obj2
            = ResourceBundle.getBundle("com.se.MyResources");
    System.out.println("���ؗp : " + obj2.getString("send"));
  }
}
