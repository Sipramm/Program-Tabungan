import java.sql.SQLOutput;
import java.util.Scanner;
public class Nasabah implements Metode {
    int id_nas;
    int jum_saldo;
    String no_hp;
    String nama;

    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("===Nasabah===");
        System.out.println("Masukan ID Customer  : ");
        id_nas=input.nextInt();
        System.out.println("Masukan Nama   :");
        nama= input.next();
        System.out.println("No Hp          :");
        no_hp= input.next();
    }
    void lihat_data(){

    }

    void update_data(){

    }

    @Override
    public void Tranfer() {
        System.out.println("Tranfer Bank");
    }

    @Override
    public void Tunai() {
        System.out.println("Tunai");

    }
}