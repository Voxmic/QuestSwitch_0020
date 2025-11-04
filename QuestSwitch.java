import java.util.Scanner;

public class QuestSwitch {
    
    public static void main(String[] args) {
        
        Scanner ns = new Scanner(System.in);

        double nilaiSD;
        double nilaiPBO;
        double nilaiBD;
        double nilaiAP;
        double nilaiRPL;
        double rataRata;

        System.out.println("Seleksi Asisten Dosen");
        System.out.println("Masukkan Nilai Mata Kuliah Anda.");
        System.out.print("Nilai Struktur Data : ");
        nilaiSD = ns.nextDouble();
        System.out.print("Nilai Pemrograman Berorientasi Objek : ");
        nilaiPBO = ns.nextDouble();
        System.out.print("Nilai Basis Data : ");
        nilaiBD = ns.nextDouble();
        System.out.print("Nilai Algoritma dan Pemrograman : ");
        nilaiAP = ns.nextDouble();
        System.out.print("Nilai Rekayasa Perangkat Lunak : ");
        nilaiRPL = ns.nextDouble();
        rataRata = (nilaiSD + nilaiPBO + nilaiBD + nilaiAP + nilaiRPL) / 5;
        System.out.println("Rata-rata Nilai Anda adalah : " + rataRata);
    }
    
}
