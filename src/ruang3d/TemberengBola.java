package ruang3d;

public class TemberengBola extends Bola{
 
    protected double tinggi;	
    public double LuasTembereng, VolumeTembereng;	

    public TemberengBola(double r, double tinggi){	
        super(r);	
        this.tinggi = tinggi;
    }	

    public void getLuasPermukaan() {	
        LuasTembereng = super.hitungLuas() * tinggi;	
    }	

    public void getVolume() {	
        VolumeTembereng = (Math.PI * Math.pow(tinggi, 2) * (3 * r - tinggi))/3;	
    }
}
