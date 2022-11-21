package pkg1p43;
public class donny63 {
    // menambah sifat static pada variabel
    static String nama;
    static int tahun_s = 2017, tahun_1 = 1998, umur;
    static double IPK;
    public static void main(String[] args) {
        //memanggil data static pada method main
        nama = "Wildan";
        System.out.println("Nama Saya : "+nama);
        System.out.println("Umur Saya : "+Umur_Saya()+" Tahun");
        NilaiIPK();
    }
    
    //menambahkan sifat static pada method return
    static int Umur_Saya() {
        umur = tahun_s -  tahun_1;
        return umur;
    }
    
    //menambahkan sifat static pada method void
    static void NilaiIPK() {
        IPK = 4.0;
        System.out.println("Nilai IPK Saya : "+IPK);
    }
}
