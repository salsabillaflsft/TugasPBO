package ruang3d;

public class JuringBola extends Bola{
    public double rKecil, tinggi, luas, volume;
    
    public JuringBola(double r, double tinggi, double rKecil) {
        super(r);
        this.rKecil=rKecil;
        this.tinggi=tinggi;
        this.luas=hitungLuas();
        this.volume=hitungVolume();
    }

    public double hitungLuas(){
        return Math.PI*(2*r*tinggi+rKecil*r);
    }

    public double hitungVolume(){
        return (2.0/3.0)*Math.PI*Math.pow(r,2)*tinggi;
    }
   
    
}
