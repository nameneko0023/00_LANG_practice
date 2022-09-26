enum Card {
  SPADES(3), CLUBS(1), 
  DIAMONDS(4), HEARTS();
  private int a;
  Card() { this.a = 100; } // �R���X�g���N�^
  Card(int a) { this.a = a; } // �R���X�g���N�^
  public int getA() { return a; }
}

public class Main {
  public static void main(String[] args) {
    Card card = Card.SPADES;
    System.out.println(card);
    System.out.println(card.getA());
    System.out.println(card.ordinal());
    System.out.println(Card.HEARTS.getA());
    for(Card obj : Card.values()){
      System.out.print(obj + " ");
    }
  }
}
