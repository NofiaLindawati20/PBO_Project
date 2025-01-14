/**
 *
 * @author
 * NAMA     : NOFIA LINDAWATI
 * KELAS    : PBO1
 * NIM      : 23215034
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Bilangan 1
 */

class matematika{
    static public double kuadrat(double nilai){
        return nilai*nilai;
    }
}
public class Bilangan1 {
    public static void main(String[] args) {
        double bilangan=matematika.kuadrat(5.0);
        System.out.println("Jadi bilangan nilai 5 yaitu"+bilangan);
    }
    
}
