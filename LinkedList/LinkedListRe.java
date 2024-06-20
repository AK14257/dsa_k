public class LinkedListRe {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add First ,method
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    //ADD LAST
    public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                size++;
                return;
            }
            tail.next=newNode;
            tail=newNode;
            size++;
    }

    //print linked list
    public void printLL(){

        if(head==null){
            System.out.println("linked list is empty");
        }
        Node temp;
        temp=head;
        while( temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void addMiddle(int index,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
        }
        Node temp;
        temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is Empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head.next=head;
        size--;
        return val;

    }
    public int removeLast(){
        if(size==0){
            System.out.println("Linked list is Empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp;
        temp=head;
        for(int i=0;i<size-2;i++){
           temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        int val=temp.data;
        size--;
        return val;
    }
    //searching iterative
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp != null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //reversing a linked list
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while( curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
    }
    public void DeleteFromNthNode(int n){
        int sz=0;
        Node temp=head;
        while (temp != null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
        }

        Node prev=head;
        int i=1;
        int itofind=sz-n;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    // finding the middle using slow and fast approach

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while( fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }





    public static void main(String args[]){
        LinkedListRe l1=new LinkedListRe();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.addMiddle(2,9);
        l1.printLL();
       // int i=l1.itrSearch(9);
        //System.out.println(i);
        l1.reverse();
        l1.printLL();
        l1.DeleteFromNthNode(3);
        l1.printLL();
    }


}
