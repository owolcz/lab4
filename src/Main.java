public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Prostokąt prostokąt = new Prostokąt();
        System.out.println("Pole prostokąta: " +prostokąt.pole(10,10));
        System.out.println("Obwód prostokąta: " + prostokąt.obwod(10,10));

        Kwadrat kwadrat = new Kwadrat();
        System.out.println("Pole kwadratu: " + kwadrat.pole(50,10));
        System.out.println("Obwód kwadratu: " + kwadrat.obwod(50,10));

        kwadrat.wiadomosc();
        prostokąt.wiadomosc();

    }
}
