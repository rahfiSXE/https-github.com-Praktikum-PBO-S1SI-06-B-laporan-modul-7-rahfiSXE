package Unguided;

public class Persegi extends Titik {
    private double sisiPSG;

    public Persegi() {
        super();
    }

    public Persegi(double x, double y) {
        super(x, y);
        this.sisiPSG = hitungJarak(new Titik(x, y));
    }

    public double getSisiPSG() {
        return sisiPSG;
    }

    public void setSisiPSG(double sisiPSG) {
        this.sisiPSG = sisiPSG;
    }

    public double hitungLuas() {
        return sisiPSG * sisiPSG;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Sisi Persegi = " + sisiPSG);
    }
}