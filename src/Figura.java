abstract class Figura {

    abstract double pole(double x, double y);
    abstract double obwod(double x, double y);

    public void nazwaFigury(String figura) {
        System.out.println("To jest figura: " + figura);
    }


}
