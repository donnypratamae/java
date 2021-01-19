package pkg1p43;
public class donny60 {
    public static String nama, makanan;
    public static void main(String[] args) {
        // membuat objek dari class donny50
        donny60 Hewan = new donny60();
        System.out.println("===== KUCING =====");
        Hewan.Kucing();
        System.out.println("===== KAMBING =====");
        Hewan.Kambing();
    }
    
    void Kucing() {
        nama = "PUS MEONG";
        makanan = "Daging pakai saus";
        System.out.println("Nama Kucing Saya Adalah "+nama);
        System.out.println("Kucing Saya Suka Makan "+makanan);
    }
    
    void Kambing() {
        nama = "EMBEK EMBE";
        makanan = "Rumput Gajah";
        System.out.println("Nama Kambing Saya Adalah "+nama);
        System.out.println("Kambing Saya Suka Makan "+makanan);
    }
}
