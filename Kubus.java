/**
 *
 * @author
 * NAMA     : NOFIA LINDAWATI
 * KELAS    : PBO6
 * NIM      : 23215034
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Perhitungan Kubus
 */
public class Kubus {
    private final int sisi;
    private final int massa;

    // Konstruktor
    public Kubus(int sisi, int massa) {
        this.sisi = sisi;
        this.massa = massa;
    }

    // Getter
    public int getSisi() {
        return sisi;
    }

    public int getMassa() {
        return massa;
    }

    // Metode untuk menghitung volume
    public int hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Metode untuk menghitung massa jenis
    public double hitungMassaJenis() {
        int volume = hitungVolume();
        return (double) massa / volume;
    }
    
    public static void main(String[] args) {
        Kubus kubus = new Kubus(5, 125);

        System.out.println("Panjang sisi: " + kubus.getSisi());
        System.out.println("Massa: " + kubus.getMassa());
        System.out.println("Volume: " + kubus.hitungVolume());
        System.out.println("Massa jenis: " + kubus.hitungMassaJenis());
    }
}
