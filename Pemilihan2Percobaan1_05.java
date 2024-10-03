import java.util.Scanner;

public class Pemilihan2Percobaan1_05{
    public static void main(String[] args){

        Scanner input05 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = input05.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.print("Tahun kabisat");
            else 
            System.out.print("Bukan tahun kabisat");

        } else 
        System.out.print("Bukan tahun kabisat");
                
    }
}