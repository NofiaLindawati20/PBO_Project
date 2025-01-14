/**
 *
 * @author
 * NAMA     : NOFIA LINDAWATI
 * KELAS    : PBO1
 * NIM      : 23215034
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Pembelian Buku
 */
class Bukuku {
    String judul;
    String pengarang;
    int jumlahBuku;
    double hargaSatuan;

    public void cetakInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Buku: " + jumlahBuku);
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
    }
}

class Buku2 extends Bukuku {
    public double hargaBuku() {
        return hargaSatuan * jumlahBuku;
    }

    public double hargaDiskon() {
        double hargaBayar = hargaBuku();
        if (hargaBayar >= 200000) {
            return hargaBayar * 0.85;
        } else if (hargaBayar >= 100000) {
            return hargaBayar * 0.9;
        } else {
            return hargaBayar;
        }
    }
}

class TestBuku {
    public static void main(String[] args) {
        // Membuat objek Buku2
        Buku2 buku1 = new Buku2();

        // Mengisi data buku
        buku1.judul = "Java";
        buku1.pengarang = "Abdul";
        buku1.jumlahBuku = 5;
        buku1.hargaSatuan = 40000;
        buku1.cetakInfo();

        double hargaTotal = buku1.hargaBuku();
        System.out.println("Harga total: " + hargaTotal);

        double hargaSetelahDiskon = buku1.hargaDiskon();
        System.out.println("Selamat Anda mendapat diskon 15%");
        System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);


    }
}
