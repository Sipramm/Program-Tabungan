public class Main {
    public static void main(String[] args) {
        int tmp;
        boolean status;
        User penabung = new User();
        penabung.setNamaAwal("Dzaki");
        penabung.setNamaAkhir("Pramudya");
        System.out.println("Nama Pemilik Tabungan "+ penabung.getNamaAwal()+penabung.getNamaAkhir());
        penabung.setTabungan(new Tabungan (100000));
        tmp = penabung.getTabungan().getSaldo();
        System.out.println("Saldo Yang Ada Dalam Tabungan Anda : "+tmp);
        penabung.getTabungan().simpanUang(100000);
        System.out.println("Anda Menabung :100000 ");
        status=penabung.getTabungan().ambilUang(50000);
        System.out.println("Jumlah Uang yang Ingin Anda diambil 50000");
        if(status)
            System.out.println(" OK");
        else
            System.out.println(" Gagal");
        penabung.getTabungan().simpanUang(50000);
        System.out.println("Anda Menabung :50000");
        status=penabung.getTabungan().ambilUang(60000);
        System.out.println("Jumlah Uang yang Ingin Anda diambil :60000");
        if(status)
            System.out.println(" OK");
        else
            System.out.println(" Gagal");
        status=penabung.getTabungan().ambilUang(75000);
        System.out.println("Jumlah Uang yang Ingin Anda diambil 75000");
        if(status)
            System.out.println(" OK");
        else
            System.out.println(" Gagal");
        penabung.getTabungan().simpanUang(15000);
        System.out.println("Anda Menabung 15000");
        tmp=penabung.getTabungan().getSaldo();
        System.out.println("Saldo Anda Yang Tersisa di Tabungan = "+tmp);
    }
}
