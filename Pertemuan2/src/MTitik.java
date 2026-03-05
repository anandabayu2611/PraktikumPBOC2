/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Ananda Putra Bayu 24060122140125  
 * Tanggal      : 5/3/2026
 */
    public class MTitik {
        public static void main(String[] args) {
            Titik T1 = new Titik();
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
        }
    }