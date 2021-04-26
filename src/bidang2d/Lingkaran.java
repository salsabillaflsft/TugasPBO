package bidang2d;

public class Lingkaran implements Bidang2d{
    double luas;
    double keliling;
    double jari;

    public double getR() {
        return jari;
    }

    public void setR(double r) {
        this.jari = r;
    }

    @Override
    public double hitungKeliling() {
        System.out.println("Keliling Lingkaran: " + hitungKeliling(jari));
        return 0;
    }
    public double hitungKeliling(double jari) {
        keliling = 2 * jari * Math.PI;
        return keliling;
    }


    @Override
    public double hitungLuas() {
        System.out.println("Luas Lingkaran: " + hitungLuas(jari));
        return 0;
    }
    public double hitungLuas(double jari) {
        luas = jari * jari * Math.PI;
        return luas;
    }
}
