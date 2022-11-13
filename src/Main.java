import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
public static void main(String[] args) {

    int timesRep;

    //--- RECOLECTA DE DATOS ---//
    // NOTA: *Si el usuario introduce más de una palábra solo se toma en cuenta la primera.*
    System.out.print("Introduce una palabra: ");
    String userWord;
    Scanner firstScan = new Scanner(System.in);

    userWord = firstScan.next();
    userWord = userWord.toUpperCase(); //Transforma la palabra a mayúsculas para evitar errores por características CaseSensitive de Java.



    //--- CREACIÓN DE LA BIBLIOTECA DE CARACTERES ---//
    // DESCRIPCION: *Dentro de esta biblioteca se almacenan las letras que componen la palabra del usuario.*
    Character[] wLib = {};

    for (int i = 0; i < userWord.length(); i++) {
        timesRep = 0;

        for (char j: wLib) {
            if (userWord.charAt(i) == j){
                timesRep++;
            }
        }

        if (timesRep == 0) {
            wLib = append(wLib, userWord.charAt(i));
        }
    }



    //--- SALIDA DE DATOS ---//
    for (char c: wLib) {
        timesRep = 0;

        for (int j: userWord.toCharArray()) {
            if (c == j) {
                timesRep++;
            }
        }

        System.out.println(c + " = " + timesRep);
    }
}



///----- ADICIÓN DE ELEMENTOS -----///
// DESCRIPCION: *Con este método se le añaden nuevos elementos a cualquier array de caracteres*
private static Character[] append(Character[] arr, char element)
{
    List<Character> list = new ArrayList<>(Arrays.asList(arr));
    list.add(element);

    return list.toArray(new Character[0]);
}

}