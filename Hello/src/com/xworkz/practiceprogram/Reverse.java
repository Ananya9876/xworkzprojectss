package com.xworkz.practiceprogram;

public class Reverse {
        public static void main(String[] args){

            int[] arr={1,2,3,4,5};
            int reverse;

            for(int i=arr.length-1;i>=0;i--){
                reverse=arr[i];
                System.out.print(reverse+" ");
            }
        }
}
