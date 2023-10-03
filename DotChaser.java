import java.util.*;

public class DotChaser {

  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 ){
      N = Integer.parseInt(args[0]);
    }
      
    Random rand = new Random(System.currentTimeMillis());

    ThingList L = new ThingList(null, 0);
    int count = 0;


    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if(count % N == 0 ) {

        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
       
        TypeA tA = new TypeA(45,50, 'a');
        L.addThing(tA);

        // Add a typeB thing to the list
        TypeB tB = new TypeB(45,50,'b');
        L.addThing(tB);

          // Add a typeC thing to the list
          TypeC tC = new TypeC(45,50,'c');
          L.addThing(tC);
      }
      L.printAll();
      L.moveAll(rand);
      count++;
    }
  }
}
