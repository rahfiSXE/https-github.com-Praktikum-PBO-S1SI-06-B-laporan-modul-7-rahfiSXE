package Unguided;

public class Limas {
    private SgtSamaSisi[] sisi4 = new SgtSamaSisi[4]; // Inisiasi array sisi4
    private Persegi sisi1;

    public Limas() {
        // Constructor tidak perlu diubah karena inisiasi array sudah dilakukan di atas
    }

    public Limas(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        sisi4[0] = new SgtSamaSisi(x1, y1);
        sisi4[1] = new SgtSamaSisi(x2, y2);
        sisi4[2] = new SgtSamaSisi(x3, y3);
        sisi4[3] = new SgtSamaSisi(x4, y4);
        sisi1 = new Persegi(x1, y1);
    }

    public double hitungLuas() {
        double luasSisi4 = 4 * sisi4[0].hitungLuas();
        double luasSisi1 = sisi1.hitungLuas();
        return luasSisi4 + luasSisi1;
    }
    public void tampil() {
        System.out.println("================================");
        System.out.println("Nama : Rahfi Hekmatiar Ayyubi");
        System.out.println("NIM  : 2211103061");
        System.out.println("================================");
        for (int i = 0; i < 4; i++) {
            sisi4[i].tampil();
        }
        sisi1.tampil();
        System.out.println("Luas Limas = " + hitungLuas());

    }
}