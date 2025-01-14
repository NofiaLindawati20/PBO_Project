package siswa;

/**
 *
 * @author
 * NAMA     : NOFIA LINDAWATI
 * KELAS    : PBO1
 * NIM      : 23215034
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Mahasiswa
 */

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private int nrp;
    
public Mahasiswa(String nama,String jurusan, int nrp){
    this.nama=nama;
    this.jurusan=jurusan;
    this.nrp=nrp;
}
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setJurusan(String jurusan){
        this.jurusan=jurusan;
    }    
    public void setNrp(int nrp){
        this.nrp=nrp;
    }
    public void info(){
        System.out.println("Nama : " +nama);
        System.out.println("Jurusan : " +jurusan);
        System.out.println("NRP : " +nrp);
    }
}
