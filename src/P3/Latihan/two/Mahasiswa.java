package P3.Latihan.two;

public class Mahasiswa {
    public String nim;
    public String nama;
    public boolean jenisKelamin; // true = laki-laki, false = perempuan
    public String alamat;
    public float ipk;

    public Mahasiswa(String nim, String nama, boolean jenisKelamin, String alamat, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.ipk = ipk;
    }

    public String getJenisKelaminAsString() {
        return jenisKelamin ? "Laki-laki" : "Perempuan";
    }

    public void print() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + getJenisKelaminAsString());
        System.out.println("Alamat: " + alamat);
        System.out.println("IPK: " + ipk);
    }
}
