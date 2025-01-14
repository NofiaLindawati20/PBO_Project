/**
 *
 * @author
 * NAMA     : NOFIA LINDAWATI
 * KELAS    : PBO6
 * NIM      : 23215034
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Array Dua Dimensi
 */

public class ArrayDuaDimensi {
public static void main(String[] args) {
    String[][] dataOrang = new String[3][2];

    dataOrang[0][0] = "Rizki";
    dataOrang[0][1] = "Semar";
    dataOrang[1][0] = "Andi";
    dataOrang[1][1] = "Lembang";
    dataOrang[2][0] = "Indi";
    dataOrang[2][1] = "Margahayu";

    // For untuk mengakses baris
    for (int i = 0; i < 3; i++) {
        // For untuk mengakses kolom
        for (int j = 0; j < 2; j++) {
            System.out.print(dataOrang[i][j] + " ");
        }
        System.out.println(); // Pindah ke baris baru setelah setiap baris data
    }
}
}
