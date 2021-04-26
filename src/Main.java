
import bidang2d.Lingkaran;
import java.util.Scanner;
import ruang3d.*;


public class Main {
    public static void main(String[] args) {
       char y_t;
        Scanner input = new Scanner(System.in);
        float set_r;
        int menu;
        Lingkaran lingkaran = new Lingkaran();
        Bola bola = new Bola();
        Tabung silinder = new Tabung();
        Kerucut kerucut = new Kerucut();

        do {
            System.out.println("================MENU================");
            System.out.println("1. Lingkaran");
            System.out.println("2. Tabung");
            System.out.println("3. Kerucut");
            System.out.println("4. Bola");
            System.out.println("5. ");
            System.out.println("6. Exit");
            System.out.println("Pilih menu : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("===========LINGKARAN===========");
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    lingkaran.NilaiLingkaran(set_r);
                    System.out.println("Luas Lingkaran : " + lingkaran.getLuasLingkaran(set_r));
                    break;

                case 2:
                    System.out.println("===========JURING===========");
                    System.out.println("JURING");
                    System.out.println("Hitung " + juring.Cetak2());
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Masukkan sudut sisi : ");
                    set_sudut = input.nextInt();
                    juring.nilaiSudut(set_sudut);
                    juring.KelilingJuring(set_r);
                    System.out.println("Keliling Juring : " + juring.getKelilingJuring());
                    juring.LuasJuring(set_r);
                    System.out.println("Luas Juring : " + juring.getLuasJuring());

                    System.out.println("===========TEMBERENG===========");
                    System.out.println("TEMBERENG");
                    System.out.println("Hitung " + juring.Cetak2());
                    System.out.println("Masukkan ukuran alas segitiga : ");
                    set_a = input.nextInt();
                    System.out.println("Masukkan tinggi segitiga : ");
                    set_ti = input.nextInt();
                    juring.LuasSegitiga(set_a, set_ti);
                    System.out.println("Luas Segitiga : " + juring.getNilaiLuasSegitiga());
                    juring.PanjangTaliBusur(set_r);
                    System.out.println("Panjang Tali busur : " + juring.getNilaiPanjangTaliBusur());
                    juring.KelilingTembereng(set_r, set_sudut);
                    System.out.println("Keliling Tembereng : " + juring.getKelilingTembereng());
                    juring.LuasTembereng();
                    System.out.println("Luas Tembereng : " + juring.getLuasTembereng());

                    System.out.println("===========BUSUR===========");
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Masukkan sudut sisi : ");
                    set_sudut = input.nextInt();
                    busur.nilaiSudut(set_sudut);
                    busur.panjangBusurJuring(set_r);
                    System.out.println("Panjang Busur  : " + busur.getPanjangBusurJuring());
                    break;

                case 3:
                    System.out.println("===========KERUCUT DAN KERUCUT TERPANCUNG===========");
                    System.out.println("KERUCUT");
                    System.out.println("Hitung " + kerucut.Cetak2());
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Masukkan tinggi kerucut : ");
                    set_ts = input.nextInt();
                    kerucut.VolumeKerucut(set_r, set_ts);
                    System.out.println(kerucut.Cetak2() + kerucut.NilaiVolumeKerucut());
                    kerucut.LuasPermukaanKerucut(set_r, set_ts);
                    System.out.println("Luas Permukaan Kerucut : " + kerucut.NilaiLuasPermukaanKerucut());
                    System.out.println();
                    System.out.println("KERUCUT TERPANCUNG");
                    System.out.println("Masukkan jari-jari atap kerucut : ");
                    set_rkecil = input.nextInt();
                    System.out.println("Masukkan tinggi kerucut terpancung : ");
                    set_tkecil = input.nextInt();
                    System.out.println("Volume Kerucut Terpancung : ");
                    kt.VolumeKerucutTerpancung(set_r,set_rkecil,set_tkecil);
                    System.out.println(kt.NilaiVolumeKerucutTerpancung());
                    kt.LuasPermukaanKerucutTerpancung(set_r, set_rkecil,set_tkecil);
                    System.out.println("Luas Permukaan Kerucut Terpancung : ");
                    System.out.println(kt.NilaiLuasPermukaanKerucutTerpancung());
                    break;

                case 4:
                    System.out.println("===========TABUNG===========");
                    System.out.println("Hitung " + silinder.Cetak2());
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    System.out.println("Masukkan tinggi silinder : ");
                    set_ts = input.nextInt();
                    silinder.VolumeSilinder(set_r, set_ts);
                    System.out.println(silinder.Cetak2() + silinder.NilaiVolumeSilinder());
                    silinder.LuasPermukaanSilinder(set_r,set_ts);
                    System.out.println("Luas Permukaan Silinder : " + silinder.NilaiLuasPermukaanSilinder());
                    break;

                case 5:
                    System.out.println("===========BOLA===========");
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    bola.VolumeBola(set_r);
                    System.out.println("Volume Bola : " + bola.NilaiVolumeBola());

                    System.out.println("===========TEMBERENG 3D===========");
                    System.out.println("Masukkan tinggi tembereng kecil : ");
                    set_tkecil2 = input.nextInt();
                    bola.VolumeBolaKecil(set_r, set_tkecil2);
                    bola.VolumeTembereng3D();
                    System.out.println("Volume Tembereng 3D : "+bola.NilaiVolumeTembereng3D());
                    tembereng3D.LuasPermukaanTembereng3D(set_r,set_tkecil2);
                    System.out.println("Luas Permukaan Tembereng 3D: ");
                    System.out.println(tembereng3D.NilaiLuasPermukaanTembereng3D());

                    System.out.println("===========JURING 3D===========");
                    System.out.println("Masukkan jari-jari : ");
                    set_rkecil2 = input.nextInt();
                    System.out.println("Masukkan tinggi  : ");
                    set_tkecil3 = input.nextInt();
                    juring3D.VolumeJuring(set_rkecil2);
                    System.out.println("Volume Juring 3D : "+juring3D.NilaiVolumeJuring());
                    juring3D.LuasPermukaanJuring(set_rkecil2,set_tkecil3);
                    System.out.println("Luas Permukaan Juring 3D: ");
                    System.out.println(juring3D.NilaiLuasPermukaanJuring());
                    break;

                default:
                    break;

            }
            System.out.println("Pilih menu lagi?");
            y_t = input.next().charAt(0);
        } while (y_t == 'y' || y_t == 'Y');
    } 
    }
}
