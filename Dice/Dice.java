
public class Dice
{
  private int value;
  private Die6 die1;
  private Die6 die2;
  public Dice() {
    die1=new Die6();
    die2=new Die6();
    this.roll();
  }
  public int getValue() {
    return this.die1.getValue()+this.die2.getValue();
  }
  public int getValue(int dNumber) {
      if (dNumber==1) {
          return this.die1.getValue();
        }
        if (dNumber==2) {
          return this.die2.getValue();
      }
      return 0;
  }
  public void roll() {
    this.die1.roll();
    this.die2.roll();
  }
  public int rollAndGetValue() {
    this.roll();
    return this.getValue();
  }
}
