public enum Vals { 
  VAL1(false), VAL2(false),
  VAL3(Boolean.FALSE), VAL4(Boolean.FALSE);
  private boolean data;
  public Vals(boolean data) { this.data = data; }
  public boolean getData() { return data; }
  public void setData() { this.data = data; }
  
  public static void main(String[] args) {
    System.out.print(Vals.VAL3 + " ");
    System.out.println(Vals.VAL3.getData());
  }
}
