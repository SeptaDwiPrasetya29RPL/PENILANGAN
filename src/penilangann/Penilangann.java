package penilangann;

import java.util.Scanner;
public class Penilangann {
    
    static void main(String[] args) {
    String nama;
    Scanner input = new Scanner(System.in);
        
 System.out.print("Nama Pelanggar = ");
 nama = input.nextLine();
 
        System.out.println("1. Tidak memakai masker");
        System.out.println("2. Tidak memiliki sim");
        System.out.println("3. Tidak dapat menunjukkan STNK");
        System.out.print("Masukan Jenis Pelanggaran :");
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.println("Pelanggaran = Tidak memakai masker");
                System.out.println("Pelanggar akan diberikan sanksi sesua peraturan yang ada");
                
            case 2:
                   System.out.println("Pelanggaran = Tidak memiliki SIM");
                System.out.println("Pelanggar akan diberikan sanksi sesua peraturan yang ada");
            case 3:
                System.out.println("Pelanggaran = Tidak dapat menunjukkan STNK");
                System.out.println("Pelanggar akan diberikan sanksi sesua peraturan yang ada");
            default:
                System.out.println("Anda harus mengisi angka");
        }
    }
    }