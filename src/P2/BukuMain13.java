package P2;

public class BukuMain13 {
    public static void main(String[] args) {
        Buku13 bk1 = new Buku13();
        bk1.judul = "Today Ends lomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71_000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60_000);
        bk1.tampilInformasi();

        Buku13 bk2 = new Buku13("Self Reward", "Maheera Ayesha", 160, 29, 59_000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
