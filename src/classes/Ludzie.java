package classes;

import interfaces.Czlowiek1;
import interfaces.Pracownik1;
import interfaces.Student1;

public class Ludzie implements Pracownik1, Student1, Czlowiek1 {

    private double waga;
    private String imie;
    private String wydzial;
    private int indeks;
    private int semestr;
    private String stanowisko;
    private int wiek;
    private int zarobki;

    public Ludzie(double waga, String imie, String wydzial, int indeks, int semestr, String stanowisko, int wiek, int zarobki) {
        this.waga = waga;
        this.imie = imie;
        this.wydzial = wydzial;
        this.indeks = indeks;
        this.semestr = semestr;
        this.stanowisko = stanowisko;
        this.wiek = wiek;
        this.zarobki = zarobki;
    }

    @Override
    public double getWaga(double waga) {
        return waga;
    }

    @Override
    public void getImie(String imie) {
        this.imie= imie;
    }

    @Override
    public void getStanowisko(String stanowisko) {
        this.stanowisko= stanowisko;
    }

    @Override
    public int getWiek(int wiek) {
        return wiek;
    }

    @Override
    public int getZarobki(int zarobki) {
        return zarobki;
    }

    @Override
    public void setWydzial(String wydzial) {
        this.wydzial= wydzial;
    }

    @Override
    public int getIndeks(int indeks) {
        return indeks;
    }

    @Override
    public int getSemestr(int semestr) {
        return semestr;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getWydzial() {
        return wydzial;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getZarobki() {
        return zarobki;
    }

    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    @Override
    public String toString() {
        return "Ludzie{" +
                "waga=" + waga +
                ", imie='" + imie + '\'' +
                ", wydzial='" + wydzial + '\'' +
                ", indeks=" + indeks +
                ", semestr=" + semestr +
                ", stanowisko='" + stanowisko + '\'' +
                ", wiek=" + wiek +
                ", zarobki=" + zarobki +
                '}';
    }
}
