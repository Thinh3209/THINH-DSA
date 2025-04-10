import DataStructure.MyStack;

public class App {
    public static void main(String[] args) throws Exception {
        // ======== Stack ===========
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.push(60);
        stack.push(80);
        System.out.println(stack.toString());
    }
}