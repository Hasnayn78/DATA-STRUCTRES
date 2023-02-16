package STACK;

public class Stack

{

    private int arr[];
    private int capacity;
    private int top;

    Stack (int size){

        arr = new int[size];

        capacity=size;

        top=-1;

    }


    public void push(int x){
        if (isFull()){
            System.out.println("Stack is Full");
            System.exit(1);
        }
        System.out.println("Inserting "+x);
        arr[++top]=x;
    }


    public int  peek(){

        if (isEmpty()){
            System.out.println("Stack is Empty");
        }

        return arr[top];
    }

    public int  pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }
         return arr[top--];

    }


    public int getSize(){
        return top+1;
    }

    public boolean isFull(){

       return top==capacity-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void printStack(){
        for (int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }



    




}
