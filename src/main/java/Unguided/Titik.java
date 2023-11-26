package Unguided;

public class Titik {
    private double x;
    private double y;

    public Titik() {
        x = 0.0;
        y = 0.0;
    }

    public Titik(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double hitungJarak(Titik t2) {
        double dx = this.x - t2.x;
        double dy = this.y - t2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void tampil() {
        System.out.println("Titik (x, y) = (" + x + ", " + y + ")");
    }
}