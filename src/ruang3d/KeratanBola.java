package ruang3d;

public class KeratanBola extends Bola{
    public double rAtas, rBawah, tinggi, luas, volume;

        public KeratanBola(double r, double rAtas, double rBawah, double tinggi) {
            super(r);
            this.rAtas=rAtas;
            this.rBawah=rBawah;
            this.tinggi=tinggi;
            this.luas=hitungLuas();
            this.volume=hitungVolume();
        }

        public double hitungLuas(){
            return Math.PI*(2*r*tinggi+Math.pow(rBawah,2)+2*Math.pow(rAtas,2));
        }

        public double hitungVolume(){
            return (Math.PI*Math.pow(rBawah,2)+Math.pow(rAtas,2) + Math.PI*Math.pow(tinggi,3)/3)/2;
        }
    
}
