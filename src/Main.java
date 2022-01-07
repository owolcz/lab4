public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */





        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */





        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */


        Dom dom1 = new Dom();
        dom1.powierzchnia(120);
        dom1.liczbaMieszkancow(10);
        dom1.liczbaOkien(10);
        dom1.powierzchniaOgrodu(130);
        dom1.adresBudynku("Świetojańska 14");
        dom1.kolorDachu(KolorEnum.CZERWONY);
        dom1.kolorDomu(KolorEnum.BIAŁY);
        System.out.println(dom1.toString());
        System.out.println("Powierzchnia całkowita= " + dom1.wyliczPowCalkowita());


        Dom dom2 = new Dom();
        dom2.powierzchnia(150);
        dom2.liczbaMieszkancow(5);
        dom2.liczbaOkien(13);
        dom2.powierzchniaOgrodu(150);
        dom2.adresBudynku("Świetojańska 18");
        dom2.kolorDachu(KolorEnum.NIEBIESKI);
        dom2.kolorDomu(KolorEnum.CZERWONY);
        System.out.println(dom2.toString());
        System.out.println("Powierzchnia całkowita= " + dom2.wyliczPowCalkowita());







    }
}
