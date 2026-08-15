package SinglyList;
public class LL{
    private Node head;
    private Node tail;
    private int size;

    public LL(){
    this.size=0;}


    //Insert first
    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        if(tail==null){
        tail=head;
    }
    size+=1;}


    // display
    public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(" "+temp.data+" ");
        temp=temp.next;
    }
    }

    //insert Middle
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

    size++;}



    // Insert Last
    public void insertLast(int data){
        if(tail==null){
            insertFirst(data);
            return;
        }
    Node node=new Node(data);
    tail.next=node;
    tail=node;

    System.out.print(node);
    size++;}



    //Delete first node
    void deleteFirst(){
    head=head.next;
        if(head==null)
            tail=null;

        size--;}

    //getbyindex
    public Node getbyIndex(int index){
        if(index < 0 || index >= size){
        throw new IndexOutOfBoundsException("Invalid index: " + index);
    }
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }


    //Delete last
    void deleteLast(){
        if(size<=1){
            deleteFirst();
            return;
        }
        Node node=getbyIndex(size-2);
        node.next=null;
        tail=node;
        size--;
    }

    //Delete middle 

    void deleteMiddle(int index){
        if(index==0){
            deleteFirst();
        }
        if(size==index+1){
            deleteLast();
        }

        Node prev=getbyIndex(index-1);

        prev.next=prev.next.next;
        size--;
    }

     //Node class

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