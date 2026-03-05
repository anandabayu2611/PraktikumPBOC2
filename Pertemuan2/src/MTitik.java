/* Nama File    : MTitik.java
 * Deskripsi    : main class untuk menguji class Titik
 * Pembuat      : Ananda Putra Bayu 24060122140125  
 * Tanggal      : 5/3/2026
 */

public class MTitik {
    public static void main(String[] args) {

        /*Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setordinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setordinat(10);
        T2.printTitik();
        */

        Titik T1 = new Titik();
        Titik T2 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        T1.printTitik();
        T2.printTitik();

        System.out.println("Kuadran T2 = " + T2.getKuadran());
        System.out.println("Jarak T2 ke pusat = " + T2.getJarakPusat());

    }
}