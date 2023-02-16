package Array;

import java.util.Arrays;

public class Addition {







    public static void addition(int []arr,int pos,int newValue){

        int size =arr.length;
        for (int i=0;i<size;i++){

            if (i==pos-1){

                arr[i]=newValue;
              //  ++size;

            }
        }
    }



    public static void addlast(int []arr,int  value){
        int size= arr.length;
        int last_index=arr.length-1;
        if (size==0){
            System.out.println("Array is empty");
        }else
        arr[last_index]=value;
    }



    public  static void add_first(int[] arr,int val){

        int size=arr.length;
        int firstIndex = 0;

        arr[firstIndex]=val;
    }


    public static void copy(int []arrOne,int[] newArr){

        int size=arrOne.length;

        for (int i=0;i<size;i++){
            newArr[i]=arrOne[i];
        }
    }

    public static void merge(int[]arrOne,int []arrTwo,int []newArr){

        int size=arrOne.length+arrOne.length;
        int pos=0;
        for (int i=0;i<arrOne.length;i++){

            newArr[pos]=arrOne[i];
            pos++;

        }
        for (int i=0;i<arrTwo.length;i++){

            newArr[pos]=arrTwo[i];
            pos++;


        }

    }



    public static void main(String[] args) {

        int []array={56,46,45,54,65,47,76,75};
        int []arrayO={55,46,45,54,65,47,76,77};
        int []arrayT={57,46,45,54,65,47,76,75};

        int length = arrayO.length+arrayT.length;
        int []newArray = new int[length];

       System.out.println(Arrays.toString(array));

        addition(array,4,66);
        addlast(array,77);

        add_first(array,74);


    //    copy(array,newArray);



      //  merge(arrayO,arrayT,newArray);
        System.out.println(Arrays.toString(array));



       // System.out.println(Arrays.toString(newArray));


    }




}
