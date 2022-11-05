public class User {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;

    public User(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    public String getNamaAwal() {
        return namaAwal;
    }
    public String getNamaAkhir() {
        return namaAkhir;
    }
    public Tabungan getTabungan() {
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}
