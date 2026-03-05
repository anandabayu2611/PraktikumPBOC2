/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Ananda Putra Bayu 24060122140125  
 * Tanggal      : 5/3/2026
 */

public class Titik {

    /***************ATRIBUT****************/
    double absis;
    double ordinat;
    static int CounterTitik = 0;

    /***************METHOD*****************/
    // konstruktor untuk membuat titik (0,0)
    /*Titik() {
        absis = 0;
        ordinat = 0;
        CounterTitik++;
    }
    */
    // konstruktor dengan parameter (overloading)
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        CounterTitik++;
    }
    // konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }
    // mengembalikan nilai countertitik
    static int getCounterTitik(){
        return CounterTitik;
    }

    /* konstruktor dengan parameter (overloading)
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }
    */
    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getordinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setordinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    // menentukan kuadran titik
    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0; // berada di sumbu
        }
    }

    // jarak titik ke pusat (0,0)
    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // jarak antara dua titik
    double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.absis,2) + 
                         Math.pow(ordinat - T.ordinat,2));
    }

    // menghasilkan titik baru hasil refleksi terhadap sumbu X
    Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    // menghasilkan titik baru hasil refleksi terhadap sumbu Y
    Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }

    // merefleksikan titik terhadap sumbu X (mengubah objek)
    void refleksiX(){
        ordinat = -ordinat;
    }

    // merefleksikan titik terhadap sumbu Y (mengubah objek)
    void refleksiY(){
        absis = -absis;
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik() {
        System.out.println(this.CounterTitik);
    }

} // end class Titik