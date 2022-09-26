@FunctionalInterface
interface Test<T> {
  default void equals() { }
  void task(T t);
}
