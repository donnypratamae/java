package pkg1p43;
public class donny62 {
    String hewan = "Domba";
    int kandang1 = 20, kandang2 = 100, hasil;
    public static void main(String[] args) {
        // membuat objek dari donny62
        donny62 data = new donny62();
        System.out.println("Jenis Hewan : "+data.jenis());
        System.out.println("Jumlahnya : "+data.Jumlah()+ " Ekor");
    }
    
    String jenis() {
        // mengembalikan nilai hewan
        return hewan;
    }
    
    int Jumlah() {
        hasil = kandang1 + kandang2;
        return hasil; //mengembalikan nilai dari hasil
    }
}