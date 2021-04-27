package ruang3d;

public class KerucutTerpacung extends Kerucut{
    public double rkecil, volumeKerucut, permukaanKerucut;
    
    public KerucutTerpacung(double r, double rkecil, double tinggi) {
        super(r,tinggi);
        this.rkecil = rkecil;
        this.volumeKerucut=hitungVolume();
        this.permukaanKerucut=hitungLuas();
    }
 
    public double s(){
        return Math.sqrt(Math.pow(r,2) + Math.pow(tinggi,2));
    }
    
    public double hitungVolume() {
        return Math.PI*super.tinggi * (Math.pow(r,2)+r*rkecil+Math.pow(rkecil,2))/3;
    }
    
    public double hitungLuas() {
        return s()*Math.PI*(r+rkecil);
    }
    
}
