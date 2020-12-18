package pkg1p43;
import javax.swing.JOptionPane;
public class donny30 {
    public static void main(String[] args) 
    {
        String donny = " ";
        donny +="\n DAFTAR INDEX BARANG";
        donny +="\n ----------------------------------";
        donny +="\n NO   NILAI   HARGA";
        donny +="\n ----------------------------------";
        int NILAI = 25, HARGA = 100, VB = 50, TN = 0, TH = 0;
        for(int NO = 1; NO <= 6; NO = NO + 1) 
        {
            TH = TH + HARGA;
            TN = TN + NILAI;
            donny +="\n    "+NO+"      "+NILAI+"        "+HARGA;
            NILAI = NILAI + 5;
            HARGA = HARGA + VB;
            VB = VB + 10;
        }
        donny +="\n --------------------------------- +";
        donny +="\n TOTAL = "+TN+"    "+TH;
        donny +="\n DONNY PRATAMA 202400116";
        JOptionPane.showMessageDialog(null, donny,"DAFTAR INDEX BANK MULYA",JOptionPane.INFORMATION_MESSAGE);
    }
}
