import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Test {
  public static void main(String[] args) {
    List<Item> items = Arrays.asList(
      new Item("apple", 100),
      new Item("banana", 200),
      new Item("orange", 130));
    Stream<Item> s = items.stream();
    items = s.filter(x -> x.getPrice() > 150)
    .collect(Collectors.toList());
    Stream<String> names = s.map(n -> n.getName());
    names.forEach(x -> System.out.println(x + " "));
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
