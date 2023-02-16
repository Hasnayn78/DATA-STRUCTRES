package STACK;

public class Main {


    public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.push(6);
        stack.push(66);
      //  stack.push(666);

        System.out.println(  stack.peek());

        System.out.println();
        stack.printStack();
        stack.pop();
        System.out.println('y');
        stack.printStack();

    }


}
