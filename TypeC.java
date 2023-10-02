import java.util.*;

public class TypeC extends Thing {
  public TypeC (int row, int col, char lab){
    this.row = row;
    this.col = col;
    this.lab = 'y';
  }

public void maybeTurn(Random ran){
    int i = ran.nextInt(2);
    if(i == 0){
        rightTurn();
    }
    else{
        leftTurn();
        rightTurn();
    }
}

}
