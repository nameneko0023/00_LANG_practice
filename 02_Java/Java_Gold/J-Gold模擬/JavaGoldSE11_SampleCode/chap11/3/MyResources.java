package com.se;
import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle {
  protected Object[][] getContents() {
    Object[][] contents = {{"send", "‘—M"},
                           {"cancel", "æÁ"}};
    return contents;
  }
}
