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
        double IPK;

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
        IPK = rataRata / 25;
        System.out.println("IPK Anda adalah : " + IPK);

        if (IPK > 3.75) {
            System.out.println("Predikat Nilai Anda : A (Sangat Baik)");
        }
        else if (IPK >= 3.50 || IPK <= 3.74) {
            System.out.println("Predikat Nilai Anda : AB (Baik Sekali)");
        }
        else if (IPK >= 3.00 || IPK <= 3.49) {
            System.out.println("Predikat Nilai Anda : B (Baik)");
        }
        else if (IPK >= 2.50 || IPK <= 2.99) {
            System.out.println("Predikat Nilai Anda : BC (Cukup)");
        }
        else if (IPK >= 2.00 || IPK <= 2.49) {
            System.out.println("Predikat Nilai Anda : C (Kurang)");
        }
        else {
            System.out.println("Nilai Tidak Valid");
        }

        if (IPK >= 3.50 || IPK > 3.75) {
            System.out.println("Anda Layak Menjadi Asisten Dosen.");
        }
        else {
            System.out.println("Maaf, Anda Belum Layak Menjadi Asisten Dosen.");
        }
    }
    
}
