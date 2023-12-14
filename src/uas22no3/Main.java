package uas22no3;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#,###");

        Kendaraan mobil = new Mobil(2500, 2.5, 0.1);
        double hargaMobil = mobil.HargaKendaraan();
        System.out.print("Harga Mobil : ");
        System.out.println(formatter.format(hargaMobil));

        Kendaraan motor = new Motor(150, 1, 0.05);
        double hargaMotor = motor.HargaKendaraan();
        System.out.print("Harga Motor : ");
        System.out.println(formatter.format(hargaMotor));

        Kendaraan listrik = new Listrik(1, 1);
        double hargaListrik = listrik.HargaKendaraan();
        System.out.print("Harga Listrik : ");
        System.out.println(formatter.format(hargaListrik));
    }
}