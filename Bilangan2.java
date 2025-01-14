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
 * Bilangan2
 */

class matematika {
    static public int kuadrat(int nilai){
        return nilai*nilai;
    }
}

public class Bilangan2 {
    public static void main(String[] args) {
        int bilangan=matematika.kuadrat(10);
        System.out.println("Bilangan dari 10 adalah " + bilangan);
    }
    
}
