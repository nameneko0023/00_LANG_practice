import java.util.*;

public class MyResources extends ListResourceBundle {
  //A
  /*
  protected Object[] getContents() {
    Object[] contents = {"Yes", "No"};
    return contents;
  }
  */
  
  //B
  /*
  protected Resource[] getContents() {
    Resource[] contents = {"Yes", "No"};
    return contents;
  }
  */
  
  //C
  /*
  protected List<String> getContents() {
    String[] ary = {"Yes", "No"};
    List<String> contents = Arrays.asList(ary);
    return contents;
  }
  */
  
  //D
  /*
  protected Object[][] getContents() {
    Object[][] contents = {{"1", "Yes"}, {"2", "No"}};
    return contents;
  }
  */
  
  //E
  /*
  protected Resource[][] getContents() {
    Resource[][] contents = {{"1", "Yes"}, {"2", "No"}};
    return contents;
  }
  */
}
