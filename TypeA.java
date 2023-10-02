import java.util.*;

public class TypeA extends Thing {
  public TypeA (int row, int col, char lab){
    this.row = row;
    this.col = col;
    this.lab = 'a';
  }

  public void maybeTurn(Random ran){
      int i = ran.nextInt(3);
        if (i == 1) {
          rightTurn();
        }
        if (i == 2) {
          leftTurn();
        }
  }


/*
   * A TypeA Thing randomly decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.
   *   A TypeB Thing
   * only considers making a random turn every 10th round.
 */


}