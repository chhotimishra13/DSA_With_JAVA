import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int num){
        data = num;
        next = null;
    }
}
public class Node1{ 

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
        }
        return head;
    }

     //insert at beg
    static Node InsertAtBeg(int num, Node head){
        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;
        return head;
    }

    //delete at beg
    static void DeleteAtBeg(Node head){
        if(head == null){
            System.out.println("LL is empty");
        }
        System.out.println(head.data +" ");
        Node temp = head;
        head = head.next;
        temp.next = null;
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
        Node SecondLast = head;
        while(last.next != null){
            SecondLast = last;
            last = last.next;
        }
        System.out.println("The delete element is : "+last.data);
        SecondLast.next = null;
    }
    
    public static void main(String[] args) {
        Node head = null;
        while(true){
            System.out.println("1. insertAtBeg\n2.InsertAtEnd\n3.display\n0.exit\n4.DeleteAtBeg\n5.DeleteAtEnd");
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
               DeleteAtBeg(head);
            }
            else if(choice == 5){
                DeleteAtEnd(head);
            }
            else if(choice == 0){
                break;
            }
            else{
                System.out.println("Enter a valid choice");
            }
        }
    }
}