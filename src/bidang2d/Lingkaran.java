package bidang2d;

public class Lingkaran implements Bidang2d{
    
    public double r, keliling, luas;

    public Lingkaran(double r){
        this.r = r;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungKeliling() {
        return 2 *  r * Math.PI;
    }

    @Override
    public double hitungLuas() {
        return r * r * Math.PI;
    }
}
