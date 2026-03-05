/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Ananda Putra Bayu 24060122140125  
 * Tanggal      : 5/3/2026
 */

public class Titik {

    /***************ATRIBUT****************/
    private double absis;
    private double ordinat;
    private static int CounterTitik;

    /***************METHOD*****************/
    // konstruktor untuk membuat titik (0,0)
    /*Titik() {
        absis = 0;
        ordinat = 0;
        CounterTitik++;
    }
    */
    // konstruktor dengan parameter (overloading)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        CounterTitik++;
    }

    // konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    // mengembalikan nilai countertitik
    public static int getCounterTitik(){
        return CounterTitik;
    }

    /* konstruktor dengan parameter (overloading)
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }
    */

    // mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        this.absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setordinat(double y) {
        this.ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // menentukan kuadran titik
    public int getKuadran(){
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
    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // jarak antara dua titik
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.getAbsis(),2) + 
                         Math.pow(ordinat - T.getOrdinat(),2));
    }

    // menghasilkan titik baru hasil refleksi terhadap sumbu X
    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    // menghasilkan titik baru hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }

    // merefleksikan titik terhadap sumbu X (mengubah objek)
    public void refleksiX(){
        ordinat = -ordinat;
    }

    // merefleksikan titik terhadap sumbu Y (mengubah objek)
    public void refleksiY(){
        absis = -absis;
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik() {
        System.out.println(this.CounterTitik);
    }

} // end class Titik