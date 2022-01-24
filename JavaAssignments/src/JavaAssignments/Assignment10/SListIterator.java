package JavaAssignments.Assignment11.Assignment10;

public class SListIterator {
    Node root;
    SListIterator(){
        root=null;
    }
    void append(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }
        else{
            Node temp=root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    void remove(int pos){
        int count=0;
        Node temp=root;
        while(count<pos){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;

    }
    void display(){
        Node temp=root;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
}
