import java.util.*;

public class TypeA extends Thing {
  public TypeA (int row, int col, char lab){
    this.row = row;
    this.col = col;
    this.lab = 'r';
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
}