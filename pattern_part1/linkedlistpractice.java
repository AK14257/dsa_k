public class linkedlistpractice {
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
    static int size=0;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;


    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void Display(){
        if(head==null){
            System.out.println("LL IS EMPTY");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        Node prev;
        prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;


    }
    public static void RemoveFromNth(int n) {
        int sz = 0;
        Node temp = head;

        // Calculate the size of the linked list
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // If the size is equal to n, remove the head
        if (sz == n) {
            head = head.next;
            return;
        }

        Node prev = head;
        int i = 1;
        int j = sz - n;

        // Traverse to the node just before the nth node from the end
        while (i < j) {
            prev = prev.next;
            i++;
        }

        // Remove the nth node
         {
            prev.next = prev.next.next;
            return;
        }
    }


    public static Node midNode(Node head){
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid=midNode(head);
        //reversing the 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        //matching valuse of 1st half to 2nd hlaf
        Node right=prev;
        Node left=head;

        while(right!=null){
            if( right.data != left.data){
                return false;

            }
            left=left.next;
            right=right.next;

        }
        return true;



    }











    public static void  main(String args[]){
        linkedlistpractice l1=new linkedlistpractice();
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(4);
        l1.addFirst(5);

        l1.Display();
        System.out.println(l1.checkPalindrome());
    }
}
