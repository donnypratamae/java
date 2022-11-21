package pkg1p43;
public class donny70 {    
    static String nama2 = "Donny Pratama";
    static String  kelamin = "Laki laki", NIM = "20.240.0116";   
    static void cetak()
    {
        String nama = "Donny Pratama";
        System.out.println("Nama                            = "+nama);
        System.out.println("Jenis kelamin                   = "+kelamin);
        String makanan = "Nasi Goreng";
        System.out.println("Makanan favorit                 = "+makanan);       
    }
    public void hitung()
       {               
        int jumlah = 2 * 1;              
        System.out.println("Jumlah Nasi goreng ketika beli  = "+jumlah+" bungkus");              
        int biaya = 10000 * 2;
        System.out.println("Total biaya beli nasi goreng    = "+biaya);
       }
    public static void main(String[] args)
    {
       cetak();
       donny70 tampil = new donny70();
       tampil.hitung();   
       System.out.println("\n==============================================\n");
       System.out.println("Nama = "+nama2);
       System.out.println("NIM = "+NIM);                         
    }    
}