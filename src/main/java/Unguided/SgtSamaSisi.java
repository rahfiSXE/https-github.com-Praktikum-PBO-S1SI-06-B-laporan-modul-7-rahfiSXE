package Unguided;

public class SgtSamaSisi extends Titik {
    private double sisiSGT;

    public SgtSamaSisi() {
        super();
    }

    public SgtSamaSisi(double x, double y) {
        super(x, y);
        this.sisiSGT = hitungJarak(new Titik(x, y));
    }

    public double getSisiSGT() {
        return sisiSGT;
    }

    public void setSisiSGT(double sisiSGT) {
        this.sisiSGT = sisiSGT;
    }

    public double hitungLuas() {
        return 0.5 * sisiSGT * sisiSGT * Math.sqrt(3);
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Sisi SgtSamaSisi = " + sisiSGT);
    }
}