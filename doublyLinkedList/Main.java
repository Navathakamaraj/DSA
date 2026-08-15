package doublyLinkedList;

public class Main {
    public static void main(String[] args){
        DL dl=new DL();
        dl.insertFirst(10);
        dl.insertFirst(20);
        dl.Display();

        dl.insertLast(40);
        dl.Display();

        dl.insertMiddle(30,2);
        dl.Display();

        // dl.deleteFirst();
        

        // dl.deleteLast();

        dl.deleteMiddle(1);
        dl.Display();



    }
}
