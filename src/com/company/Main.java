package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter first word");
        String S1 = kbInput.nextLine();
        System.out.println("Enter second word");
        String S2 = kbInput.nextLine();
        char[] word1 = S1.toLowerCase() .toCharArray();
        char[] word2= S2.toLowerCase() .toCharArray();


            Arrays.sort(word1);
            Arrays.sort(word2);


        if(Arrays.equals(word1,word2)) {
            System.out.println("These words are anagrams");
        }
        else
        {
            System.out.println("These words are not anagrams");

        }

    }
}
