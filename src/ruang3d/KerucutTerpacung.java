package ruang3d;

public class KerucutTerpacung extends Kerucut{
    public double rkecil, lp, volume;
    
    public KerucutTerpacung(double r, double rkecil, double tinggi) {
        super(r,tinggi);
        this.rkecil = rkecil;
        this.lp=hitungLuas();
        this.volume=hitungVolume();
    }
 
    public double s(){
        return Math.sqrt(Math.pow(r,2) + Math.pow(tinggi,2));
    }
    
    @Override
    public double hitungLuas(){
        return Math.PI*(Math.pow(r,2)+r*s());
    }

    public double hitungVolume(){
        return Math.PI*tinggi*(Math.pow(r,2)*Math.pow(rkecil,2)+r*rkecil)/3;
    }
}
