public class Main {
   public static void main(String[] args){
        CL cl=new CL();
        cl.insertFirst(10);
        cl.insertLast(20);
        cl.insertLast(30);
        cl.display();

        cl.deleteMiddle(1);
        cl.display();

   }
   }