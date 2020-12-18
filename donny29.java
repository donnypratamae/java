package pkg1p43;
public class donny29 {
    public static void main(String[] args) 
    {
        System.out.println("DAFTAR INDEX BARANG");
        System.out.println("-------------------");
        System.out.println(" NO   NILAI   HARGA");
        System.out.println("-------------------");
        int NILAI = 25, HARGA = 100, VB = 50, TN = 0, TH = 0;
        for(int NO = 1; NO <= 6; NO = NO + 1) 
        {
            TH = TH + HARGA;
            TN = TN + NILAI;
            System.out.println("  "+NO+"    "+NILAI+"      "+HARGA);
            NILAI = NILAI + 5;
            HARGA = HARGA + VB;
            VB = VB + 10;
        }
        System.out.println("------------------- +");
        System.out.println("TOTAL = "+TN+"    "+TH);
        System.out.println("");
        System.out.println("DONNY PRATAMA 202400116");
    }
}
