
import bidang2d.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import ruang3d.*;


public class Main {
    public static void main(String[] args) {
        char y_t;
        Scanner input = new Scanner(System.in);
        double r, tinggi, rkecil;
        int menu,menukerucut,menubola;

        do {
            menu = 0 ; menukerucut= 0; menubola = 0;
            System.out.println("================MENU================");
            System.out.println("1. Lingkaran");
            System.out.println("2. Tabung");
            System.out.println("3. Kerucut, Kerucut Terpancung");
            System.out.println("4. Bola, Cincin Bola, Tembereng Bola, Keratan Bola");
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
                                
                                //KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(r,rkecil,tinggi);

                            
                                //System.out.println("Luas Permukaan Kerucut Terpancung adalah " + kerucutTerpancung.lp);
                                //System.out.println("Volume Kerucut Terpancung adalah " + kerucutTerpancung.volume);
                          
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
                          
                                
                                
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("===========Cincin Bola===========");
                            try{
                         
                                
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("===========Tembereng Bola===========");
                            try{
                         
                                
                            }catch(InputMismatchException e){
                                System.err.println("Input berupa Angka!");
                                y_t = input.next().charAt(0);
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("===========Keratan Bola===========");
                            try{
                         
                                
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
