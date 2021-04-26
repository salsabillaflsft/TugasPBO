/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3d;

import bidang2d.Lingkaran;

public class Tabung extends Lingkaran{
     private double tinggi;
     
       public Tabung(double jari, double tinggi){
       super(jari);
       this.tinggi = tinggi;
    }

    public double getVolume() {
        double VolumeTabung = (super.hitungLuas()*tinggi);
        return VolumeTabung;
    }

    public double getLuasPermukaan() {
        double luasSelimut= super.hitungKeliling()*tinggi;
        double LuasPermukaanTabung = 2* super.hitungLuas() + luasSelimut;
        return LuasPermukaanTabung;
    }
    
}
