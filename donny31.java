package pkg1p43;
import java.util.Scanner;
public class donny31 {
    public static void main(String[] args) 
    {
        String NB;
        int JB, HB, AY = 1, AZ = 0, AW = 0;
        String masuk="T";
        Scanner inputsiswa = new Scanner(System.in);
       while (("Y").equals(masuk) | ("y".equals(masuk))) 
       {
           int HK;
           System.out.println(" NO : "+AY);
           System.out.println("     TOKO MAKMUR SEJAHTERA    ");
           System.out.println("     ---------------------    ");
           System.out.println("");
           System.out.print("    1. NAMA BARANG   : ");NB = inputsiswa.next();
           System.out.print("    2. HARGA BARANG  : Rp ");HB = inputsiswa.nextInt();
           System.out.print("    3. JUMLAH BARANG : ");JB = inputsiswa.nextInt();
           HK = HB * JB;
           AY = AY + 1;
           System.out.println("        JUMLAH HARGA        : "+HK);
           System.out.println("            "+HB+"     TOTAL   : "+HK);
           System.out.print("       INPUT DATA LAGI (Y/T) = ");masuk=inputsiswa.next();
           HK = HB * JB;
           AY = AY + 1;
           AZ = AZ + HK;
           AW = AW + JB;
       }
       System.out.println(" ================================== ");
       System.out.println("           REKAB BARANG            ");
       System.out.println("  1. TOTAL JUMLAH BARANG  : "+AW);
       System.out.println("  2. TOTAL BAYAR          : Rp. "+AZ);
       System.out.println(" ");
       System.out.println("       TERIMAKASIH      ");
    }
}
