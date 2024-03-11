class Node{
  int data;
  Node next;
  Node(int data)  {
    this.data=data;
    this.next=null;
  }
}
class Single_linked_list{
    static void Display(Node head){
        Node current=head;
        while(current.next!=null){
            System.out.print("[" + current.data +"]"+"--> ");
            current=current.next;
        }
        System.out.print("[" + current.data +","+current.next+"]");
        System.out.println();
    }
    static Node insertAtBegin(Node head,int data){
        Node nn=new Node(data);
        nn.next=head;
        head=nn;  
        return head;
    }
    static Node insertAtEnd(Node head,int data){
        Node nn=new Node(data);
        Node current=head;
        if(current==null){
            head=nn;
        }
        else{
            for(current=head;current.next!=null;current=current.next);
                current.next=nn;
        }
        return head;
    }
    static Node insertAtMid(Node head,int data,int pos){
        Node nn=new Node(data);
        Node current=head;
        if(pos==1){
            head=insertAtBegin(head,data);
        }
        else{
            for(int i=1;i<pos-1;i++){
                current=current.next;
            }
            nn.next=current.next;
            current.next=nn;
        }
        return head;
    }
    static Node deleteAtBegin(Node head){
        if(head==null){
            System.out.println("Linked list is empty,can't perform deletion operation");
        }
        else{
            head=head.next;
        }
        return head;
    }
    static Node deleteAtEnd(Node head){
        Node current=head;
        Node ptr=null;
        if(head==null){
            System.out.println("Linked list is empty,can't perform deletion operation");
        }
        else{
            while(current.next!=null){
                ptr=current;
                current=current.next;
             }
             ptr.next=null;
        }
        return head;
    }
    static Node deleteAtMid(Node head,int pos){
        Node current=head;
        if(head==null){
            head=deleteAtBegin(head);
        }
        else{
            for(int i=1;i<pos-1;i++){
                current=current.next;
              }
            current.next=current.next.next;
        }
        return head;
    }
    public static void main(String args[]){
        Node head=null;
        //System.out.print(head);
        head=deleteAtBegin(head);
        head=deleteAtMid(head,1);
        head=deleteAtMid(head,3);
        head=deleteAtEnd(head);
        head=insertAtEnd(head,8);
        head=insertAtMid(head,7,1);
        Display(head);
        head=insertAtBegin(head,4);
        head=insertAtEnd(head,6);
        Display(head);
        head=insertAtMid(head,1,1);
        head=insertAtBegin(head,2);
        Display(head);
        head=insertAtMid(head,5,3);
        head=insertAtEnd(head,3);
        Display(head);
        head=deleteAtEnd(head);
        Display(head);
        head=deleteAtMid(head,3);
        Display(head);
        head=deleteAtBegin(head);
        Display(head);
    }
}