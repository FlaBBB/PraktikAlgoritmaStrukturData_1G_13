package P7;

public class PencarianBuku13 {
    Buku13 listBk[] = new Buku13[5];
    int idx;

    void tambah(Buku13 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku13 m : listBk) {
            m.tampil();
            System.out.println("----------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
            this.listBk[pos].tampil();
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public Buku13 FindBuku(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        if (posisi != -1) {
            return listBk[posisi];
        } else {
            return null;
        }
    }
}

