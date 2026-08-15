package SinglyList;
public class LL{
    private Node head;
    private Node tail;
    private int size;

    public LL(){
    this.size=0;}

    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        if(tail==null){
        tail=head;
    }
    size+=1;
    //   System.out.print(head+"  " +node.next);
}

    public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}

public void insertMiddle(int data,int index){
    if(index==0){
        insertFirst(data);
        return;
    }
    if(index==size){
        insertLast(data);
        return;
    }
 
    Node temp=head;
    for(int i=1;i<index;i++){
        temp=temp.next;

    }

    Node node=new Node(data,temp.next);
    temp.next=node;

    size++;
}

    public void insertLast(int data){
        if(tail==null){
            insertFirst(data);
            return;
        }
    Node node=new Node(data);
    tail.next=node;
    tail=node;

    System.out.print(node);
    size++;
}


private  class Node{
    private int data;
    private Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public Node(int data) {
        this.data = data;
    }

    
}
}