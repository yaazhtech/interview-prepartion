package com.yaazhtech.training.collections;

public class ReverseString {

    public static void main(String args[]){
        //Scanner input=new Scanner();

        String result=reverseInput("yaazhtech");
        System.out.println(result);

    }

    private static String reverseInput(String input) {
        //TimeComplexity, Auxilary Space
        // apporach 1: we have iterate the input and swap with extra variable
        // appraoch 2: use two pointer to swap it
        // approach 3: read from reverse way
        // yaazhtech [y-0,a-1,a-2......h-n]
        char[] inputChar=input.toCharArray();
       StringBuilder stringBuilder=new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){ // starts from 0, to size
         //9
            stringBuilder.append(inputChar[i]);

        }

        return stringBuilder.toString();
    }
}
