package pkg1p43;
public class donny24 {
    public static void main(String[] args) 
    {
        int PISANG = 2, JERUK, LEMON = 1, tot, gt = 0;
        do 
        {
            JERUK = 9 - PISANG;
            tot = 0;
            LEMON = 1;
            while(JERUK>=1)
            {
                System.out.print("  ");
                JERUK = JERUK - 1;
            }
            do
            {
                System.out.print(PISANG+"   ");
                tot = tot + PISANG;
                LEMON = LEMON + 1;
            }
            while(LEMON<PISANG);
            while(LEMON<=7)
            {
                System.out.print("  ");
                LEMON = LEMON + 1;
            }
            System.out.println("   =   "+tot);
            gt = gt + tot;
            PISANG = PISANG + 1;
        }
        while(PISANG<=7);
        System.out.println("========================================= + ");
        System.out.println("       TOTAL KESELURUHAN         =   "+gt);
        System.out.println("");
        System.out.println("DONNY PRATAMA 202400116");
    }
}
