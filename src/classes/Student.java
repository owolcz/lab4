package classes;

import interfaces.Student1;

public class Student implements Student1 {

    private double waga;
    private String imie;
    private String wydzial;
    private int indeks;
    private int semestr;


    public Student(double waga, String imie, String wydzial, int indeks, int semestr) {
        this.waga = waga;
        this.imie = imie;
        this.wydzial = wydzial;
        this.indeks = indeks;
        this.semestr = semestr;
    }

    @Override
    public double getWaga(double waga) {
        return waga;
    }

    @Override
    public void getImie(String imie) {
        this.imie = imie;
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

    @Override
    public String toString() {
        return "Student{" +
                "waga=" + waga +
                ", imie='" + imie + '\'' +
                ", wydzial='" + wydzial + '\'' +
                ", indeks=" + indeks +
                ", semestr=" + semestr +
                '}';
    }
}
