public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }


    public void print(){
        if(head==tail){
            System.out.println("empty linked list");
            return;

        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    private static Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while( fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;

    }

    public static Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public static Node mergeSort(Node head){
        if(head ==null || head.next==null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead=mid.next;
        mid.next=null;

        Node newLeft =mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public void ZigZag(){
        //find Mid
        Node slow=head;
        Node fast=head.next;
        while( fast !=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        // reverse 2nd half
        Node current=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        Node left = head;
        Node right=prev;
        Node nextl,nextr;
        //alternate zigzag

        while (left !=null && right != null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;


            left=nextl;
            right=nextr;
        }
    }
    public static void main(String args[]){
        LinkedList l1=new LinkedList();

        l1.addFirst(1);

        l1.addFirst(2);

        l1.addLast(3);

        l1.addLast(4);
        l1.print();

        l1.head=l1.mergeSort(l1.head);
        l1.print();
        l1.ZigZag();
        l1.print();


    }



}
