/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siswa;

/**
 *
 * @author
 * NAMA     : NOFIA LINDAWATI
 * KELAS    : PBO1
 * NIM      : 23215034
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Mahasiswa1
 */

public class Mahasiswa1 {

    private String nama;
    private String jurusan;
    private int nrp;

    public Mahasiswa1(String nama, String jurusan, int nrp) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public static void main(String[] args) {
        Mahasiswa1 mahasiswa1 = new Mahasiswa1("cita", "telkom", 7206);
        Mahasiswa1 mahasiswa2 = new Mahasiswa1("raka", "it", 7306);

        System.out.println("nama: " + mahasiswa1.getNama());
        System.out.println("jurusan: " + mahasiswa1.getJurusan());
        System.out.println("nrp: " + mahasiswa1.getNrp());

        System.out.println("nama: " + mahasiswa2.getNama());
        System.out.println("jurusan: " + mahasiswa2.getJurusan());
        System.out.println("nrp: " + mahasiswa2.getNrp());
    }
}    
