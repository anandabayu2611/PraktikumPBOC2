/* Nama File    : MTitik.java
 * Deskripsi    : main class untuk menguji class Titik
 * Pembuat      : Ananda Putra Bayu 24060122140125  
 * Tanggal      : 5/3/2026
 */

public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // konstruktor tanpa parameter
    public Garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    // konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // getter
    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    // setter
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    // panjang garis
    public double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    // gradien
    public double getGradien(){
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        return (y2 - y1) / (x2 - x1);
    }

    // titik tengah
    public Titik getTitikTengah(){
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;

        return new Titik(x,y);
    }

    // cek sejajar
    public boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    // cek tegak lurus
    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    // tampilkan titik
    public void printGaris(){
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // persamaan garis
    public String getPersamaanGaris(){
        double m = getGradien();
        double x = titikAwal.getAbsis();
        double y = titikAwal.getOrdinat();

        double c = y - (m * x);

        return "y = " + m + "x + " + c;
    }
}