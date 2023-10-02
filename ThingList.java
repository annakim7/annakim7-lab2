import java.util.*;

  public class ThingList{
    private Node head;
    public int count;

    // node class
    private class Node{
      private Thing data;
      private Node next;

      public Node(Thing data){
        this.data = data;
        this.next = null;
      }
    }

// constructor
public ThingList(Thing thing, int i){
  this.head = null;
  this.count = 0;
}

  public void addThing (Thing thing){
    Node t = new Node(thing);
    t.data = thing;
    if(this.head == null){
      this.head = t;
      return; 
    }
    Node check = this.head;
    while(check.next !=null){
      check = check.next;
    }
    check.next = t;
  }

  public void moveAll(Random rand){
    for(Node T = head; T != null; T = T.next ) {
        T.data.maybeTurn(rand);
        T.data.step();
      }
    }
  
    public void printAll(){
      for( Node T = this.head; T != null; T = T.next ){
      System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);
     }
     System.out.println("done");
     System.out.flush();
    }



  

}