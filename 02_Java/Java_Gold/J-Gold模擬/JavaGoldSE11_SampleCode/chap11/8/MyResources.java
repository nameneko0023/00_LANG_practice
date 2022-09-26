import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle {
  protected Object[][] getContents() {
    Object[][] contents = {{"data",   "MyResources.class"}};
    return contents;
  }
}