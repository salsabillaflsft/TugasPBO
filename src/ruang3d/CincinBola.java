package ruang3d;

public class CincinBola extends Bola{
    public double tali, tinggi, rAtas, rBawah;

    public CincinBola(double r, double rAtas, double rBawah, double tali, double tinggi){
        super(r);
        this.tali = tali;
        this.tinggi = tinggi;
        this.rAtas = rAtas;
        this.rBawah = rBawah;
        this.luas = hitungLuas();
        this.volume = hitungVolume();
    }

    @Override
    public double hitungLuas(){
        return Math.PI *(2.0 * r * tinggi + tali * ( rAtas + rBawah));
    }

    @Override
    public double hitungVolume(){
        return (Math.PI * tinggi * Math.pow(tali,2)) / 6.0;
    }
    
}
