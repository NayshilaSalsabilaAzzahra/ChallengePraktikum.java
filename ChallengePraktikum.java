import java.util.Scanner;

public class ChallengePraktikum {
    public static void main(String[] args) {
        // 1. Menyimpan data NIM dan Nama Mahasiswa dalam array
        String[] nim = {"220250040004", "20250040113", "20250040014", "20250040099", "20250040150"};
        String[] nama = {"Nayshila", "Nadia", "Adinda", "Airin", "Nasa"};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        String cari = input.nextLine();
        
        int posisi = -1;
        int jumlahPerbandingan = 0;

        // 2. Mencari mahasiswa berdasarkan Nama menggunakan Linear Search
        for (int i = 0; i < nama.length; i++) {
            jumlahPerbandingan++; // Menghitung setiap langkah perbandingan
            if (nama[i].equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }

        // 3. Menampilkan hasil
        System.out.println("-------------------------------");
        if (posisi != -1) {
            // a. Status ditemukan
            System.out.println("Status: Mahasiswa Ditemukan");
            // b. Posisi indeks
            System.out.println("Posisi Indeks: " + posisi);
            System.out.println("NIM: " + nim[posisi]);
            System.out.println("Nama: " + nama[posisi]);
        } else {
            System.out.println("Status: Mahasiswa Tidak Ditemukan");
        }
        // c. Jumlah perbandingan pencarian
        System.out.println("Jumlah Perbandingan: " + jumlahPerbandingan);
        System.out.println("-------------------------------");
        
        input.close();
    }
}