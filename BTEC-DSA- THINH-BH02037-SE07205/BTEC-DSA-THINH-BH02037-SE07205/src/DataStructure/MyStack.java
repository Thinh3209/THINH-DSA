package DataStructure;

public class MyStack {
    // Linked list to store the data
    // top
    Node top;

    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
        }
    }

    public MyStack() {
        top = null;
    }

    public void push(int value) {
        if (top == null) {
            top = new Node(value);
        } else {
            // top.next = new Node(value);
            // top = top.next;
            // Viết lại như sau:
            Node temp = new Node(value);
            temp.next = top;
            top = temp;

        }
    }
    // Sinh viên hoàn thành các operations sau:
    // 2. pop()
    // 3. peek()
    // 4. isEmpty()
    // 5. search()
    // 6. display()
    // 7. size()

}
