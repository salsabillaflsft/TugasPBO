
import bidang2d.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import ruang3d.*;


public class Main {
    public static void main(String[] args) {
        char y_t;
        Scanner input = new Scanner(System.in);
        double r = 0, tinggi = 0, rkecil=0, rbawah=0, ratas=0, tali=0;
        int menu,menukerucut,menubola;

        do {
            menu = 0 ; menukerucut= 0; menubola = 0;
            System.out.println("================MENU================");
            System.out.println("1. Lingkaran");
            System.out.println("2. Tabung");
            System.out.println("3. Kerucut, Kerucut Terpancung");
            System.out.println("4. Bola, Cincin Bola, Tembereng Bola, Keratan Bola, Juring Bola");
            System.out.println("5. Exit");
            System.out.print("Pilih menu : ");      
            try {
                menu = input.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Input berupa angka!");
                y_t = input.next().charAt(0);
            }
            
            switch (menu) {
                case 1:
                    System.out.println("===========LINGKARAN===========");
                    try{
                    System.out.print("Masukkan ukuran jari-jari : ");
                    r = input.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(r);
                    
                    System.out.println("Luas Lingkaran adalah " + lingkaran.luas);
                    System.out.println("Keliling Lingkaran adalah " + lingkaran.keliling);
                    }
                    catch(InputMismatchException e){
                        System.err.println("Input berupa Angka!");
                        y_t = input.next().charAt(0);
                    }
                    break;

                case 2:
                    System.out.println("===========TABUNG===========");
                          try{
                            System.out.println("== Tabung ==");
                            System.out.print("Masukkan jari-jari alas : ");
                            r = input.nextDouble();
                            System.out.print("Masukkan tinggi tabung : ");
                            tinggi = input.nextDouble();
                            Tabung tabung = new Tabung(r, tinggi);
                            
                            System.out.println("Luas Permukaan Tabung adalah " + tabung.lp);
                            System.out.println("Volume Tabung adalah " + tabung.volume);
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                 y_t = input.next().charAt(0);
                            }
                            break;
                case 3:
                    System.out.println("===========KERUCUT===========");
                    System.out.println("");
                    System.out.println("=== Bangun Ruang ===");
                    System.out.println("1. Kerucut");
                    System.out.println("2. Kerucut Terpancung");
                    System.out.print("Pilih : ");
                    try {
                        menukerucut= input.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println("Input berupa angka!");
                        y_t = input.next().charAt(0);
                    }
                    switch (menukerucut) {
                        case 1: {
                            System.out.println("===========KERUCUT===========");
                            try{
                                System.out.print("Masukkan jari-jari alas : ");
                                r = input.nextDouble();
                                System.out.print("Masukkan tinggi kerucut : ");
                                tinggi = input.nextDouble();
                                Kerucut kerucut = new Kerucut(r,tinggi);
                            
                                System.out.println("Luas Permukaan Kerucut adalah " + kerucut.lp );
                                System.out.println("Volume Kerucut adalah " + kerucut.volume);
                          
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("===========KERUCUT TERPANCUNG===========");
                            try{
                                System.out.print("Masukkan jari-jari alas : ");
                                r = input.nextDouble();
                                System.out.print("Masukkan jari-jari alas kecil : ");
                                rkecil = input.nextDouble();
                                System.out.print("Masukkan tinggi kerucut : ");
                                tinggi = input.nextDouble();
                                
                                KerucutTerpacung kerucutTerpancung = new KerucutTerpacung(r,rkecil,tinggi);
                                
                                System.out.println("Luas Permukaan Kerucut Terpancung adalah " + kerucutTerpancung.permukaanKerucut);
                                System.out.println("Volume Kerucut Terpancung adalah " + kerucutTerpancung.volumeKerucut);
                          
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
          
                        default: {
                            System.out.println("Menu yang dipilih tidak ada");
                            break;
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("===========BOLA==========="); 
                    System.out.println("");
                    System.out.println("=== Bangun Datar ===");
                    System.out.println("1. Bola");
                    System.out.println("2. Cincin Bola");
                    System.out.println("3. Tembereng Bola");
                    System.out.println("4. Keratan Bola");
                    System.out.println("5. Juring Bola");

                    System.out.print("Pilih : ");
                    try {
                        menubola= input.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println("Input berupa angka!");
                        y_t = input.next().charAt(0);
                    }
                    switch (menubola) {
                        case 1: {
                            System.out.println("===========BOLA===========");
                            try{
                            System.out.println("== Bola ==");
                            System.out.print("Masukkan jari-jari : ");
                            r = input.nextDouble();
                            Bola bola = new Bola(r);
                            System.out.println("Luas Permukaan Bola adalah " + bola.lp);
                            System.out.println("Volume Bola adalah " + bola.volume);                    
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("===========Cincin Bola===========");
                            try{
                                System.out.print("Masukkan jari-jari Bola: ");
                                r = input.nextDouble();
                                System.out.print("Masukkan jari-jari atas: ");
                                ratas = input.nextDouble();
                                System.out.print("Masukkan jari-jari bawah: ");
                                rbawah = input.nextDouble();
                                System.out.print("Masukkan tinggi: ");
                                tinggi = input.nextDouble();
                                System.out.print("Masukkan panjang tali: ");
                                tali = input.nextDouble();
                                CincinBola cincinBola = new CincinBola(r,ratas,rbawah,tali,tinggi);

                                System.out.println("Luas Cincin Bola= " + cincinBola.luas);
                                System.out.println("Volume Cincin Bola= " + cincinBola.volume);

                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("===========Tembereng Bola===========");
                            try{
                            System.out.print("Masukkan jari-jari Bola (R): ");
                            r = input.nextDouble();
                            do{
                                System.out.print("Masukkan tinggi tembereng : ");
                                tinggi = input.nextDouble();
                                if(tinggi>=r){
                                    System.err.println("Tinggi tembereng tidak melebihi jari-jari!");
                                }
                            }while(tinggi >= r);
                            TemberengBola tembereng = new TemberengBola(r, tinggi);
                            System.out.println("Luas Permukaan Tembereng Bola adalah " + tembereng.LuasTembereng);
                            System.out.println("Volume Tembereng Bola adalah " + tembereng.VolumeTembereng); 
        
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("===========Keratan Bola===========");
                            try{
                                System.out.print("Masukkan jari-jari Bola: ");
                                r = input.nextDouble();
                                System.out.print("Masukkan jari-jari atas: ");
                                ratas = input.nextDouble();
                                System.out.print("Masukkan jari-jari bawah: ");
                                rbawah = input.nextDouble();
                                System.out.print("Masukkan tinggi: ");
                                tinggi = input.nextDouble();
                                
                                KeratanBola keratanBola = new KeratanBola(r,ratas,rbawah,tinggi);
                                System.out.println("Luas Keratan Bola = " + keratanBola.luas);
                                System.out.println("Volume Keratan Bola= " + keratanBola.volume);
                         
                                
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
                        case 5: {
                            System.out.println("===========Juring Bola===========");
                            try{
                                System.out.print("Masukkan jari-jari Bola: ");
                                r = input.nextDouble();
                                System.out.print("Masukkan jari-jari bawah: ");
                                rbawah = input.nextDouble();
                                System.out.print("Masukkan tinggi: ");
                                tinggi = input.nextDouble();
                                JuringBola juringBola = new JuringBola(r,tinggi,rbawah);
                                System.out.println("Luas Juring Bola = " + juringBola.luas);
                                System.out.println("Volume Juring Bola= " + juringBola.volume);
                         
                                
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
                             
          
                        default: {
                            System.out.println("Menu yang dipilih tidak ada");
                            break;
                        }
                    }
                    break;  

                default:
                    break;

            }
            System.out.print("Pilih menu lagi? ");
            y_t = input.next().charAt(0);
        } while (y_t == 'y' || y_t == 'Y');
    } 


}
 
