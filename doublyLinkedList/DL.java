package doublyLinkedList;

public class DL {
    private Node head;
    private Node tail;
  
    private int size;

    DL(){
        size=0;
    }

    //insert at first

    void insertFirst(int data){
        Node node=new Node(data);
        if(head==null){

            head=node;
            tail=node;
            size++;
            return;
        }

        head.prev=node;
        node.next=head;
        head=node;
        size++;


    }

    void Display(){
        Node temp=head;
        for(int i=0;i<size;i++){
            
            // System.out.print(temp.prev+"---");
            System.out.print("---"+temp.data+"---");
            // System.out.print(temp.next);
            temp=temp.next;
        }
        System.out.println();
    }

    void insertLast(int data){
        Node node=new Node(data);
        if (head == null) { // empty list
        head = node;
        tail = node;
    }
        if(tail==head){
            tail=node;
            node.prev=head;
            head.next=node;
            size++;
        }

        tail.next=node;
        node.prev=tail;
        tail=node;
        size++;


    }

    Node getByIndex(int index){
        
        Node temp=head;
         for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp;
       
    }


    void insertMiddle(int data,int index){
        Node node=new Node(data);
        Node PN;
        if(index==0){
           insertFirst(data);
           return;
        }
        if(index==size){
            insertLast(data);
            return;
        }

        PN=getByIndex(index);
        Node nextNode = PN.next;
        node.prev=PN;
        node.next=nextNode;
        PN.next=node;
        if (nextNode != null) {
        nextNode.prev = node;
    }
        
        size++;
}

     void deleteFirst(){
    head=head.next;
    head.prev=null;
        if(head==null)
            tail=null;
            size--;}

     void deleteLast(){
        if(size<=1){
            deleteFirst();
            return;
        }
        
       tail.prev=tail;
       tail.next=null;
        size--;
    }

    void deleteMiddle(int index){
         if(index==0){
            deleteFirst();
        }
        if(size==index+1){
            deleteLast();
        }

        Node prev=getByIndex(index+1);

        Node tempN=prev.next;
        Node tempP=prev.prev;
        tempP.next=tempN;
        tempN.prev=tempP;
        size--;

        

    }

    




   private  class Node{

       public int data;
       public  Node next;
       public Node prev;

        Node(int data){
            this.data=data;
        }

        Node(int data,Node prev,Node next){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }

        



    }


    
}
