
import bidang2d.Lingkaran;
import java.util.Scanner;
import ruang3d.*;


public class Main {
    public static void main(String[] args) {
       char y_t;
        Scanner input = new Scanner(System.in);
        float r;
        int menu;
        Lingkaran lingkaran = new Lingkaran();
        Bola bola = new Bola();
        Tabung silinder = new Tabung();
        Kerucut kerucut = new Kerucut();

        do {
            System.out.println("================MENU================");
            System.out.println("1. Lingkaran");
            System.out.println("2. Tabung");
            System.out.println("3. Kerucut, Kerucut Terpancung");
            System.out.println("4. Bola, Cincin Bola, Tembereng Bola, Keratan Bola");
            System.out.println("5. Exit");
            System.out.println("Pilih menu : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("===========LINGKARAN===========");
                    System.out.println("Masukkan ukuran jari-jari : ");
                    r = input.nextInt();
                    lingkaran.setR(r);
                    lingkaran.hitungLuas();
                    lingkaran.hitungKeliling();
                    
                    break;

                case 2:
                    System.out.println("===========TABUNG===========");
                    
                    break;

                case 3:
                    System.out.println("===========KERUCUT===========");

                    
                    break;

                case 4:
                    System.out.println("===========BOLA===========");
             
                    break;

                default:
                    break;

            }
            System.out.println("Pilih menu lagi?");
            y_t = input.next().charAt(0);
        } while (y_t == 'y' || y_t == 'Y');
    } 
}
