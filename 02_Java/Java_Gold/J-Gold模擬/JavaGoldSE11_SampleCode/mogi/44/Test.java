import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    List<Item> items = Arrays.asList(
      new Item("apple", 100),
      new Item("banana", 200),
      new Item("orange", 130));
    Predicate<Item> p = b -> b.getPrice() > 150;
    items.stream().filter(p)
    .map(Item::getName)
    .peek(x -> System.out.print(x + " "))
    .collect(Collectors.toList());
  }
}
class Item {
  String name;
  int price;
  Item(String name, int price) {
    this.name = name;
    this.price = price;
  }
  String getName() {
    return name;
  }
  int getPrice() {
    return price;
  }
  public String toString() {
    return name + ":" + price;
  }
}
