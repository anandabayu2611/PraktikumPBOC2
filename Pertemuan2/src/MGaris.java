/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Ananda Putra Bayu 24060122140125  
 * Tanggal      : 5/3/2026
 */

public class MGaris {

    public static void main(String[] args) {

        Titik t1 = new Titik(-2,0);
        Titik t2 = new Titik(0,4);

        Garis g1 = new Garis(t1,t2);

        g1.printGaris();

        System.out.println("Panjang garis: " + g1.getPanjang());
        System.out.println("Gradien: " + g1.getGradien());

        Titik tengah = g1.getTitikTengah();
        System.out.print("Titik tengah: ");
        tengah.printTitik();

        System.out.println(g1.getPersamaanGaris());

        System.out.println("Jumlah objek garis: " + Garis.getCounterGaris());

    }

}