import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
}
class LinkedList {
    Node head = null;
    void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("linked list is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.insert(val);
        }
        list.display();
    }
}
