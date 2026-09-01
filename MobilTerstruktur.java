public class MobilTerstruktur {

    // Fungsi terstruktur (menerima data mentah sebagai parameter)
    public static void nyalakanMesin(String merk, String warna) {
        System.out.println("Mesin mobil " + merk + " berwarna " + warna + " berhasil dinyalakan!");
    }

    public static void main(String[] args) {
        // Data disimpan dalam variabel biasa
        String merkMobil = "Toyota";
        String warnaMobil = "Hitam";

        // Memanggil fungsi dengan memasukkan variabel
        nyalakanMesin(merkMobil, warnaMobil);
    }
}