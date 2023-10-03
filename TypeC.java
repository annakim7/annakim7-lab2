import java.util.*;

public class TypeC extends Thing {
  public TypeC (int row, int col, char lab){
    this.row = row;
    this.col = col;
    this.lab = 'y';
  }

public void maybeTurn(Random ran){
  int i = ran.nextInt(2);
  timeSinceLast++;
  if (timeSinceLast == 1) {
    timeSinceLast = 0;
      this.rightTurn();
      this.leftTurn();
      this.rightTurn();
    }
    if(i == 1){
      leftTurn();
    }
  }
}
