package classes;

import interfaces.Pracownik1;

public class Pracownik implements Pracownik1 {

    private double waga;
    private String imie;
    private String stanowisko;
    private int wiek;
    private int zarobki;


    public Pracownik(double waga, String imie, String stanowisko, int wiek, int zarobki) {
        this.waga = waga;
        this.imie = imie;
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
        return "Pracownik{" +
                "waga=" + waga +
                ", imie='" + imie + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", wiek=" + wiek +
                ", zarobki=" + zarobki +
                '}';
    }
}
