package homework;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    


    /* Write a program that will reverse a sentence */

    public static void main(String[] args) {


        
        String sentence = "racecar"; // halb


        String reverseSentence = "";

        for(int i = sentence.length()-1; i >= 0; i--) {


            reverseSentence = reverseSentence + sentence.charAt(i);


        }

        System.out.println(reverseSentence);




    }


}
