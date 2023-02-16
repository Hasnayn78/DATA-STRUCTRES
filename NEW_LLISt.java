package LinkedList;

public class NEW_LLISt {

Node head;
private int size=0;


    class Node {
        int data;
        Node next;


        Node(int d){

            this.data=d;

        }


    }

    public Node insert(int data){
        Node p = head;
        if(p==null){

           head =new Node(data);

        }else {
            while (p.next != null) {

                p = p.next;
            }
            p.next = new Node(data);

        }
        return head;
    }



    public int size(){

        Node current= head;
        while(current!=null){
            size++;
            current=current.next;
        }

        return size;
    }


    public int search(int data_value){
        int  node=1;
        if (head==null){
            return -1;
        }
        if (head.data==data_value){
            return node;
        }
        for (Node p=head.next;p!=null;p=p.next){
            node++;
            if (p.data==data_value){
                return node;
            }
        }

        return -1;
    }


    public int sum(){

        int sum=0;
        Node p=head;

        while (p!=null){
            sum+= p.data;
            p=p.next;
        }
        return sum;
    }



    public NEW_LLISt copy (){

        NEW_LLISt lliSt2= new NEW_LLISt();
        Node p=head;
        while (p!=null){

            lliSt2.insert(p.data);

            p=p.next;

        }

        return lliSt2;


    }

    public void deleteFirst() {
        if(head == null) return;
        head = head.next;
    }



    public void show (){


        Node current=head;
        while (current!=null){
            System.out.print(current.data+" ");

            current=current.next;
        }
    }

    public void deleteLast() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node p;
        p = head;
        while(p.next.next!= null) {
            p = p.next;
        }
        p.next = null;
    }








}
