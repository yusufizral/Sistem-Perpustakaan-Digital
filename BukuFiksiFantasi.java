public class BukuFiksiFantasi extends BukuFiksi {
    private String duniaFiksi;

    public BukuFiksiFantasi(String judul, String penulis, int tahunTerbit, String genre, String duniaFiksi) {
        super(judul, penulis, tahunTerbit, genre);
        this.duniaFiksi = duniaFiksi;
    }

    public String getDuniaFiksi() {
        return duniaFiksi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Dunia Fiksi : " + duniaFiksi);
    }
}
