import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */

//        Zad.1
        String tab[] = {"Audi", "BMW", "Mercedes", "Lexus", "Porshe", "McLaren"};
        Scanner scan= new Scanner(System.in);
        int index = -1;

        System.out.println("Podaj indeks tablicy [0-5], który ma być wyświetlony: ");

        try{
            index = Integer.parseInt(scan.next());
        }catch (NumberFormatException e){
            System.err.println("Zły znak");
            throw e;
        }
        try {
            System.out.println(tab[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Podałeś indeks wykraczający poza rozmiar tablicy");
        }finally {
            System.out.println("Koniec programu");
        }













        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */


        try {
            int result = 10 / 0;
            System.out.print("a) Czy ten kod się wykona ?");
            /* błąd arytmetyczny */
            /* jeśli zostanie rzucony błąd klasy ArithmeticException, to zostanie wywołany kod z sekcji catch */
        } catch (ArithmeticException e) {
//            e.getMessage() - komunikat błedu
            System.out.println("ArithmeticException " + e.getMessage()); // ArithmeticException / by zero
        }

        try {
            String name = null;
            name.toString();
        } catch (NullPointerException e) {
            System.out.println("Błąd nie można wywołać metody toString() na null");
            throw e; // rzuca komunikat z klasy Exception
        }
    }
}
