import org.w3c.dom.Node;

public class CL{
    private Node head;
    private Node tail;
    private  int size;

    CL(){
        size=0;
    }

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


    public void display(){
    Node temp=head;
    do{
        System.out.print(" "+temp.data+" ");
        temp=temp.next;
    }

    
    while(temp!=head);

    System.out.println();
        
    }


    //Insert first
    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        if(tail==null){
        tail=head;
    }
    size+=1;}

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

    } Node node=new Node(data,temp.next);
    temp.next=node;

    size++;}






    //insert in head and middle is same as singly linked list


    //insert in tail
    void insertLast(int data){
        Node node=new Node(data);
        if(head!=null){
        tail.next=node;
        tail=node;
        tail.next=head;
        size++;
        }
        if(head==null){
            insertFirst(data);
            size++;
        }


    }


    void deleteFirst(){
    head=head.next;
    tail.next=head;
    
        if(head==null)
            tail=null;

        size--;}


   //Delete last
    void deleteLast(){
        if(size<=1){
            deleteFirst();
            return;
        }
        Node node=getbyIndex(size-2);
        tail=node;
        tail.next=head;
        size--;
    }


    void deleteMiddle(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(size==index+1){
            deleteLast();
            return;
        }

        Node prev=getbyIndex(index-1);

        prev.next=prev.next.next;
        size--;
    }



    void deleteUsingValue(int data){


         if(head.data==data){
            deleteFirst();
            return;
        }
        if(tail.data==data){
            deleteLast();
            return;
        }

        Node temp=head;
        
        if(temp.data==data){
           deleteFirst();
           return;
        }
        if(temp.data==tail.data){
            deleteLast();
            return;
        }

        for(int i=1;i<size-1;i++){
            Node n=temp.next;
            if(n.data==data){
            temp.next=n.next;
            return;
            }
        }

     

    }


    private class Node{
       private  int data;
       private Node next;

        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}

