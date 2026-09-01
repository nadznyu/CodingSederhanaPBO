// Definisi Kelas (Blueprint)
class Mobil {
    String merk;
    String warna;

    // Method yang melekat pada objek
    public void nyalakanMesin() {
        System.out.println("Mesin mobil " + this.merk + " berwarna " + this.warna + " berhasil dinyalakan!");
    }
}

public class MobilPBO {
    public static void main(String[] args) {
        // Membuat Objek (Instansiasi) dari kelas Mobil
        Mobil mobilku = new Mobil();
        
        // Mengisi data ke dalam atribut objek
        mobilku.merk = "Toyota";
        mobilku.warna = "Hitam";

        // Memanggil method melalui objek
        mobilku.nyalakanMesin();
    }
}