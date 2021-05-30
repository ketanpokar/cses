package cses;

import java.util.Scanner;

public class MaxOccurenceCharaterCount {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String string = s.nextLine();

        char previousCharacter='N';
        char currentCharacter;
        int count = 0;
        int max = 0;
        for(int i = 0 ; i < string.length() ; i++) {
            currentCharacter = string.charAt(i);
            if(currentCharacter == previousCharacter) {
                count++;
            } else {
                count = 1;
            }
            if(max < count) {
                max = count;
            }
            previousCharacter = currentCharacter;
        }

        System.out.println(max);

    }

}
