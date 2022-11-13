import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String userWord;
        Scanner firstScan = new Scanner(System.in);
        int timesRep;

        userWord = firstScan.next();
        userWord = userWord.toUpperCase();
        Character[] wLib = {};

        for (char i = 0; i < userWord.length(); i++) {
            timesRep = 0;

            for (char t: wLib) {
                if (userWord.charAt(i) == t){
                    timesRep++;
                }
            }

            if (timesRep == 0) {
                wLib = append(wLib, userWord.charAt(i));
            }
        }

        for (char i: wLib) {
            timesRep = 0;

            for (int j: userWord.toCharArray()) {
                if (i == j) {
                    timesRep++;
                }
            }

            System.out.println(i + " = " + timesRep);
        }
    }




    private static Character[] append(Character[] arr, char element)
    {
        List<Character> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new Character[0]);
    }

}