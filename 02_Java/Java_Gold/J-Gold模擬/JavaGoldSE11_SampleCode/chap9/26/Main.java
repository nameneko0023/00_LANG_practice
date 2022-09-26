import java.nio.file.*;
import java.nio.file.attribute.*;

public class Main {
  public static void main(String[] args) throws java.io.IOException {
    Path p1 = Paths.get("data.txt");
    DosFileAttributes attr =
            Files.readAttributes(p1, DosFileAttributes.class);
    System.out.format("isArchive     : %s%n", attr.isArchive());
    System.out.format("isHidden      : %s%n", attr.isHidden());
    System.out.format("isReadOnly    : %s%n", attr.isReadOnly());
    System.out.format("isSystem      : %s%n", attr.isSystem());
  }
}
