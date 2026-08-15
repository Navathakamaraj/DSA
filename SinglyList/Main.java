package SinglyList;
public class Main {
    public static void main(String[] args){
        LL list=new LL();
        list.insertFirst(10);
        list.insertLast(20);


        
        list.insertLast(40);
      
       
        list.insertMiddle(30,2);
    

        list.deleteMiddle(1);
        list.display();

    }
}
