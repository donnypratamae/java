package pkg1p43;
import java.util.Scanner;
public class donny28 {
    public static void main(String[] args) 
    {
        String NM, KT;
        int UM, US;
        String masuk ="Y";
        Scanner inputsiswa = new Scanner(System.in);
        while (("y".equals(masuk) | ("Y".equals(masuk))))
        {
        System.out.println("        INPUT DATA SISWA        ");
        System.out.println("     ----------------------     ");
        System.out.println(" ");
        System.out.print("    1. NAMA       : ");NM = inputsiswa.next();
        System.out.print("    1. KOTA       : ");KT = inputsiswa.next();
        System.out.print("    1. UMUR       : ");UM = inputsiswa.nextInt();
        System.out.print("    1. UANG SAKU  : Rp. ");US = inputsiswa.nextInt();
        System.out.println("   ============================= ");
        System.out.print("       DATA YANG ANDA INPUT       ");
        System.out.println("");
        System.out.println("    1. NAMA       :"+NM);
        System.out.println("    1. KOTA       :"+KT);
        System.out.println("    1. UMUR       :"+UM);
        System.out.println("    1. UANG SAKU  :Rp. "+US);
        System.out.println("    ++++++++++++++++++++++++++++");
        System.out.print("        INPUT DATA LAGI [Y/T] = ");masuk=inputsiswa.next();
        }
    }
}
