import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int num){
        data = num;
        next = null;
        prev = null;
    }
}
public class DoubleLL{ 

    //print LL
    static void display(Node head){
        if(head == null){
            System.out.println("LL is empty");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    //insert at position 
    static Node insertAtPos(int num, int pos, Node head){
        Node newNode = new Node(num);
       
        if(pos < 0){
            System.out.println("Invalid position");
        }
        else if(pos == 1 || head == null){
            if(head != null){
                head.prev = newNode;
            }
            newNode.next = head;
            head = newNode;

        }
        else{
            Node temp = head;
            for(int i=1; i<=pos-2; i++){

                temp = temp.next;
                if(temp == null){
                    System.out.println("Position beyound the list");
                    return head;
                }
            }
            newNode.prev = temp;
            newNode.next = temp.next;
            if(temp.next != null){
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            
        }
        return head;
    }

    //insert at end
    static Node InsertAtEnd(int num, Node head){
        Node newNode = new Node(num);
        if(head == null){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        return head;
    }

     //insert at beg
    static Node InsertAtBeg(int num, Node head){
        Node newNode = new Node(num);
        if(head !=null){
            head.prev= newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    //delete at beg
    static Node deleteAtBeg(Node head)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
            System.out.println("The deleted element is: "+head.data);
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        return head;
    }

    //delete at end
    static void DeleteAtEnd(Node head){
        if(head == null){
            System.out.println("LL is empty");
        }
        if(head.next == null){
            System.out.println("There is only one element");
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        System.out.println("The delete element is : "+last.data);
        last.prev.next = null;
    }

    //delete at pos
    static Node deleteAtPos(int pos,Node head)
    {
        if(head==null)//for empty list
        {
            System.out.println("List is Empty");
        }
        else if(pos<=0)//negative or 0 position
        {
            System.out.println("Invalid position");
        }
        else if (pos==1)
        {
        	System.out.println("The deleted element id"+head.data);
        	head=head.next;
            head.prev = null;
        }
        else{
            Node last = head;
            for(int i=1;i<=pos-1;i++)//3<=4
            {
                // last2=last;//3
                last=last.next;//last=3
                if(last==null)
                {
                    System.out.println("position beyond the list");
                    return head;
                }
            }
            // last2.next=last.next;
            System.out.print("the deleted element is"+last.data);
            last.prev.next = last.next;
            if(last.next != null){
                last.next.prev = last.prev;
            }

        }
        return head;
    }
    
    public static void main(String[] args) {
        Node head = null;
        while(true){
            System.out.println("0.exit\n1. insertAtBeg\n2.InsertAtEnd\n3.display\n4.deleteAtBeg\n5.deleteAtEnd\n6.insertAtPos\n7.deleteAtPos");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = s.nextInt();

            if(choice == 1){
                System.out.println("Enter a number into the LL: ");
                int num = s.nextInt();
                head = InsertAtBeg(num,head);
                
            }
            else if(choice == 2){
                System.out.println("Enter a number into the LL: ");
                int num = s.nextInt();
                head = InsertAtEnd(num,head);
            }
            else if(choice == 3){
                display(head);
            }
           
            else if(choice  == 4){
               head = deleteAtBeg(head);
            }
            else if(choice == 5){
                DeleteAtEnd(head);
            }
            else if(choice == 6){
                System.out.println("Enter a number into the LL: ");
                int num = s.nextInt();
                int pos = s.nextInt();
                head = insertAtPos(num, pos, head);
            }
            else if(choice == 7){
                System.out.print("Enter position: ");
            	int pos  = s.nextInt();
                head=deleteAtPos(pos,head);
            }
            // else if(choice == 0){
            //     break;
            // }
            else{
                System.out.println("Enter a valid choice");
            }
        }
    }
}