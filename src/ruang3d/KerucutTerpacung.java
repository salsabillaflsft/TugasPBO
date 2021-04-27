package ruang3d;

public class KerucutTerpacung extends Kerucut{
    public double rkecil, volumeKerucut, permukaanKerucut;
    
    public KerucutTerpacung(double r, double rkecil, double tinggi) {
        super(r,tinggi);
        this.rkecil = rkecil;;
    }
 
    public double s(){
        return Math.sqrt(Math.pow(r,2) + Math.pow(tinggi,2));
    }
    
    public double getVolume() {
        volumeKerucut = Math.PI*super.getTinggi() * (Math.pow(r,2)+r*rkecil+Math.pow(rkecil,2))/3;
        return volumeKerucut;
    }
    public double getLuasPermukaan() {
        permukaanKerucut = s()*Math.PI*(r+rkecil);
        return permukaanKerucut;
    }
}
