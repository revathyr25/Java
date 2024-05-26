package Sorting;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args){
        Random random=new Random();
        int[] numbers=new int[10];
        for(int i=0;i<10;i++){
            numbers[i]=random.nextInt(100);
        }
        //int[] numbers=new int[]{40,90,73,31,41,11,61,90,96,82};
        System.out.println("Before");
        display(numbers);
        bubbleSort(numbers);
        System.out.println("After");
        display(numbers);
    }

    private static void bubbleSort(int[] array){
        boolean flag=true;
        while (flag){
            flag=false;
            for (int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    flag=true;
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
    }
    private static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
