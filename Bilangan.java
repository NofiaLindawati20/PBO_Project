/**
 *
 * @author
 * NAMA     : NOFIA LINDAWATI
 * KELAS    : PBO1
 * NIM      : 23215034
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Matematika
 */

class matematika {
    static public double kuadrat(double nilai){
        return nilai*nilai;
    }
}

public class Bilangan {

    public static void main(String[] args) {
       double bilangan=matematika.kuadrat(25.0);
       System.out.println("Nilai dari 25 adalah " + bilangan);
    }
    
}
