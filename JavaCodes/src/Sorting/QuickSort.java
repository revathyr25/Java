package Sorting;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args){
        Random random=new Random();
        int[] numbers=new int[10];
        for(int i=0;i<10;i++){
            numbers[i]=random.nextInt(100);
        }
        //int[] numbers=new int[]{40,90,73,31,41,11,61,90,96,82};
        System.out.println("Before");
        display(numbers);
        quickSort(numbers,0,numbers.length-1);
        System.out.println("After");
        display(numbers);

    }
    private static void quickSort(int[] array,int lowIndex,int highIndex){
        if(lowIndex>=highIndex){
            return;
        }
        int pivot=array[highIndex];
        int leftP=lowIndex;
        int rightP=highIndex;
        while (leftP<rightP){
            while (array[leftP]<=pivot&&leftP<rightP){
                leftP++;
            }while (array[rightP]>=pivot&&leftP<rightP){
                rightP--;
            }
            swap(array,leftP,rightP);

        }
        swap(array,leftP,highIndex);
        quickSort(array,lowIndex,leftP-1);
        quickSort(array,leftP+1,highIndex);
    }
    private static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

    private static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
