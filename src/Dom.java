class Dom implements Budynek2{

    private int liczbaMieszkancow;
    private int liczbaOkien;
    private double pow;
    private String adres;
    private KolorEnum kolorEnum;
    private KolorEnum kolorDachu;
    private double powOgrodu;


    @Override
    public void liczbaMieszkancow(int liczbaMieszkancow) {
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    @Override
    public int liczbaOkien(int liczbaOkien) {
        this.liczbaOkien = liczbaOkien;
        return liczbaOkien;
    }

    @Override
    public double powierzchnia(double pow) {
        this.pow = pow;
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return adres;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolorEnum = kolor;
    }

    @Override
    public double powierzchniaOgrodu(double powOgrodu) {
        this.powOgrodu = powOgrodu;
        return powOgrodu;
    }

    @Override
    public void kolorDachu(KolorEnum kolorDachu) {
        this.kolorDachu = kolorDachu;
    }

    public int getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }

    public void setLiczbaMieszkancow(int liczbaMieszkancow) {
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    public int getLiczbaOkien() {
        return liczbaOkien;
    }

    public void setLiczbaOkien(int liczbaOkien) {
        this.liczbaOkien = liczbaOkien;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public KolorEnum getKolorEnum() {
        return kolorEnum;
    }

    public void setKolorEnum(KolorEnum kolorEnum) {
        this.kolorEnum = kolorEnum;
    }

    public KolorEnum getKolorDachu() {
        return kolorDachu;
    }

    public void setKolorDachu(KolorEnum kolorDachu) {
        this.kolorDachu = kolorDachu;
    }

    public double getPowOgrodu() {
        return powOgrodu;
    }

    public void setPowOgrodu(double powOgrodu) {
        this.powOgrodu = powOgrodu;
    }

    protected int wyliczPowCalkowita(){
        return (int) (this.pow + powOgrodu);
    }

    @Override
    public String toString(){
        return "Powierzchnia= " + pow +
                ", powierzchnia ogrodu= " +powOgrodu +
                ", Kolor dachu= " + kolorDachu +
                ", kolor domu= " + kolorEnum +
                ", adres= " + adres +
                ", lizcba okien= " + liczbaOkien +
                ", liczba mieszkańców= " + liczbaMieszkancow;

    }






}