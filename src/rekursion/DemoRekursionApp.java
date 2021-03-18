package rekursion;

import java.util.Locale;

public class DemoRekursionApp {
    /*
        Was it a car or a cat I saw
        Murder for jar of red rum
        Go hang a salami, I'm a lasagna hog

        Otto

        1122332211
     */
    public static void main(String[] args) {
        System.out.println("isPalindrom(\"1122332211\") = " + isPalindrom("1122332211"));
        System.out.println("isPalindrom(\"Otto\") = " + isPalindrom("Otto"));
        System.out.println("isPalindrom(\"Was it a car or a cat I saw\") = " + isPalindrom("Was it a car or a cat I saw"));
    }

    public static boolean isPalindrom(String text) {
        // Wir überprüfen, ob das erste und das letzte Zeichen ident sind
        /*
            -> wenn es eine Liste wäre, dann first und last herauslesen und vergleichen
            -> wenn iden, dann first und last löschen
            -> weiter vergleichen bis ende oder fehler
         */
        text = text.toLowerCase();
        text = text.replace(" ","");
        char firstCharacter = text.charAt(0);
        char lastCharacter = text.charAt(text.length() - 1);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        if (firstCharacter == lastCharacter){
            text = text.substring(1, text.length() -1); // erstes und letztes Zeichnen weggeschnitten
            System.out.println(text);
            if (text.length() <= 1){
                return true;
            }
            return isPalindrom(text); //sich selbst wieder aufrufen => rekursion
        }
        return false;
    }
}
