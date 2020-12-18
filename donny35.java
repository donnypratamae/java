package pkg1p43;
import javax.swing.*;
public class donny35 
{
    private static String os;
    private static int nli, harga;
    public static void main(String[] args) 
    {
        
        String lagi = "y";
        String info = "";
        String rekab = "";
        int jbarang = 0;
        boolean c;
        do 
        {
            String nama = JOptionPane.showInputDialog("MASUKKAN MEREK HP");
            do 
            {
                os = JOptionPane.showInputDialog("MASUKKAN JENIS OS [ANDOID/IOS]");
            }
            while (!("android".equals(os) | "ANDROID".equals(os) | "ios".equals(os) | "IOS".equals(os)));
            
            do 
            {
                String nilai = JOptionPane.showInputDialog("MASUKKAN KONDISI HP");
                nli = Integer.parseInt(nilai);
                boolean a = nli>=0;
                boolean b = nli<=100;
                c = a & b;
            }
            while (!(c));
            
            String jenis = "IOS";
            if ("ANDROID".equals(os) | ("android".equals(os)))
            {
                jenis = "ANDROID";
            }
            
            String kondisi;
            if (nli <= 70) 
            {
                kondisi = "TIDAK LAYAK PAKAI";
            }
            else 
            {
                kondisi = "LAYAK PAKAI";
            }
            
            String hasil = "";
            if (nli<=50)
            { hasil = "JELEK SEKALI"; }
            else if (nli<=60)
            { hasil = "JELEK"; }
            else if (nli<=70)
            { hasil = "NORMAL"; }
            else if (nli<=80)
            { hasil = "BAIK"; }
            else if (nli<=90) 
            { hasil = "BAGUS"; }
            else if (nli<=100) 
            {hasil = "SANGAT BAGUS";}
            else 
            { hasil = "A"; }
            String harga = JOptionPane.showInputDialog("HARGA HANDPHONE");
            int price = Integer.parseInt(harga);
            String jh = JOptionPane.showInputDialog("JUMLAH HANDPHONE");
            int jb = Integer.parseInt(jh);
            
            
            info += "\n Nama Handphone      = "+nama;
            info += "\n Jenis OS                = "+jenis;
            info += "\n Kondisi                 = "+nli+"%";
            info += "\n Keterangan              = "+kondisi;
            info += "\n Grade                   = "+hasil;
            info += "\n Jumlah Barang           = "+jb;
            info += "\n Jumlah Harga            = "+harga;
            
            JOptionPane.showMessageDialog(null, info, "KETERANGAN",JOptionPane.INFORMATION_MESSAGE);
            info = "";
            do 
            {
                lagi = JOptionPane.showInputDialog("INPUT DATA [Y/T]");
            }
            while (!("y".equals(lagi) | "Y".equals(lagi) | "t".equals(lagi) | "T".equals(lagi)));

            int total = 0;
            total = total + jb;
            jbarang = jbarang + total;
        }
        while("y".equals(lagi)|"Y".equals(lagi));
        rekab += "";
        rekab += "\n TOTAL BARANG MASUK     : "+jbarang;
        JOptionPane.showMessageDialog(null, rekab, "REKAB SEMUA BARANG",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
