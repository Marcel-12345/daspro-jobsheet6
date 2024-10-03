import java.util.Scanner;

public class Tugas6_05{
    public static void main(String[] args){

        Scanner input05 = new Scanner(System.in);

        String jenisBuku;
        int buku = 20000;
        int jumlah;
        double diskon, jumlahDiskon, hargaBayar;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = input05.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlah = input05.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")){
            diskon = 0.1;
            if (jumlah > 2)
            diskon += 0.02; 
            else
            diskon += 0;
        } else if (jenisBuku.equalsIgnoreCase("novel")){
            diskon = 0.07;
            if (jumlah > 3)
            diskon += 0.02;
            else 
            diskon += 0.01;
        } else if (jumlah > 3) {
        diskon = 0.05;
        } else
        diskon = 0;

        jumlahDiskon = buku * jumlah * diskon;
        hargaBayar = buku * jumlah - jumlahDiskon;

        System.out.println("Jumlah diskon = Rp. " + jumlahDiskon);
        System.out.println("Harga yang harus dibayar = Rp. " + hargaBayar);
    }
}