package ruang3d;

public class TemberengBola extends Bola{
 
    protected double tinggi;	
    public double LuasTembereng, VolumeTembereng;	

    public TemberengBola(double r, double tinggi){	
        super(r);	
        this.tinggi = tinggi;
        this.LuasTembereng = hitungLuas();
        this.VolumeTembereng = hitungVolume();
    }	

    public double hitungLuas() {	
        return super.hitungLuas()*tinggi;	
    }	

    public double hitungVolume() {	
        return (Math.PI * Math.pow(tinggi,2)*(3.0 * r - tinggi))/3.0;	
    }
}
