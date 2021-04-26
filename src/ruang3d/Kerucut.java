package ruang3d;

import bidang2d.Lingkaran;
public class Kerucut extends Lingkaran{
    public double tinggi,lp,volume;

    public Kerucut(double r, double tinggi) {
        super(r);
        this.tinggi=tinggi;
        this.lp=hitungLuas();
        this.volume=hitungVolume();
    }
    
    public double s(){
        return Math.sqrt(Math.pow(r,2) + Math.pow(tinggi,2));
    }
   

    @Override
    public double hitungLuas(){
        return super.luas+(Math.PI*r*s());
    }

    public double hitungVolume(){
        return super.luas*tinggi/3;
    }
}
