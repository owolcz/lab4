public class Kwadrat extends Figura{
    @Override
    double pole(double x, double y) {
        return x * y;
    }

    @Override
    double obwod(double x, double y) {
        return x + y;
    }
}
