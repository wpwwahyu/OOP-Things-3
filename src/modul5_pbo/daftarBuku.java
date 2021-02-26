package modul5_pbo;

import java.util.Scanner;
import java.util.ArrayList;



public class daftarBuku {
    public static void main(String[] args) {
        ArrayList infoBuku = new ArrayList();
        int code = 1;
        kelolaBuku kb = new kelolaBuku();
        Scanner in = new Scanner(System.in);
        int data = 0; //tipe data buat simpan inputan
        do {
            try {
                System.out.print("masukkan type buku : ");
                String type = in.nextLine();
                System.out.print("masukkan judul buku : ");
                String judul = in.nextLine();
                System.out.print("Masukkan Jumlah Halaman: ");
                int jumhalaman = in.nextInt();
                
                kb.setJudul(judul);
                kb.setJumlahhalaman(jumhalaman);
                kb.setType(type);
                infoBuku.add("Type: " + kb.getType() + " |Judul: " + kb.getJudul() + " | Jumlah Halaman: " + kb.getJumlahhalaman());
                data++;
                System.out.println("apakah ingin mengulang?");
                System.out.println("jika ya 1)");
                System.out.println("jika tidak 0)");
                code = in.nextInt();
                in.nextLine();

            }
            catch (java.util.InputMismatchException salah) {
            System.out.println("Salah Menginputkan");
            in.nextLine();
        }
//            catch(ArrayIndexOutOfBoundsException salah){
//                System.out.println(salah);
//                break;
//            }
        }
            while (code !=0);
        
        
        for (Object ww: infoBuku)
            System.out.println(ww);
        }
    }
