package P8;


public class Gudang13 {
    Barang13[] tumpukan;
    int size;
    int top;

    Gudang13 (int kapasitas) {
        this.tumpukan = new Barang13[kapasitas];
        this.size = kapasitas;
        this.top = -1;
    }

    public boolean cekKosong() {
        return this.top == -1;
    }

    public boolean cekPenuh() {
        return this.top == this.size - 1;
    }

    public void tambahBarang(Barang13 brg) {
        if (this.cekPenuh()) {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
            
            return;
        }

        System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");

        this.tumpukan[++this.top] = brg;
    }

    public Barang13 ambilBarang() {
        if (this.cekKosong()) {
            System.out.println("Gagal! Tumpukan barang di gudang kosong");

            return null;
        }

        System.out.println("Barang " + this.tumpukan[this.top].nama + " diambil dari Gudang.");
        
        return this.tumpukan[this.top--];
    }

    public void lihatBarangTeratas () {
        if (this.cekKosong()) {
            System.out.println("Tumpukan barang kosong.");
            return;
        }

        System.out.println("Barang teratas: " + this.tumpukan[this.top].nama);   
    }

    public void tampilkanBarang() {
        if (cekKosong()) {
            System.out.println("Tumpukan barang kosong.");
            return;
        }

        System.out.println("Rincian tumpukan barang di Gudang: ");
        for (int i = 0; i <= this.top; i++) {
            System.out.printf("Kode %d: %s (Kategory %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
        }
    }
}   
