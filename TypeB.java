import java.util.*;


public class TypeB extends Thing{
    public TypeB (int row, int col, char lab){
        this.row = row;
        this.col = col;
       this.lab = 'a';
    }

public void maybeTurn(Random rand){
    int i = rand.nextInt(3);
        this.timeSinceLast++;
        if (this.timeSinceLast == 10) {
          this.timeSinceLast = 0;
          if (i == 1) {
            rightTurn();
          }
          if (i == 2) {
            leftTurn();
          }
        }
    }
}