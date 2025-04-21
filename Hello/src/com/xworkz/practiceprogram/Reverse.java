package com.xworkz.practiceprogram;

public class Reverse {
        public static void main(String[] args){

            int[] arr={1,2,3,4,5};
            char[] letter={'A','N','A','N','Y','A'};
            int reverse;
            int rev;

            for(int i=arr.length-1;i>=0;i--){
                reverse=arr[i];
                System.out.print(reverse+" ");
            }
            System.out.println();

            for(int j=letter.length-1;j>=0;j--){
                rev=letter[j];
                System.out.print(rev+" ");
            }
        }
}
