package ucuncuhafta;

public class Kedi extends Hayvan {

    public static void main(String[] args) {
        Kedi biyik = new Kedi();
        biyik.konus();
        Kedi enes = new Kedi();
        enes.konus();
    }

    private void agziniBuk() {

    }
    private void nefesAl() {

    }
    protected void bizeOzel() {

    }

    public int getYas() {
        return 5;
    }

    public String getYasStr() {
        return "5";
    }

    public String getAd() {
        return "pamuk";
    }

    public int kuyrukBoyu() {
        return 10;
    }

    public void konus() {
        System.out.println("Miyav!");
        agziniBuk();
        nefesAl();
        //ağzını büküyor
        // dilini dişine değdiriyor
        // nefes alıyor
        // nefes verirken dudaklarını büküyor
        // dişinin olması lazım
    }
}
