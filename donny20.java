package pkg1p43;
public class donny20 {
    public static void main(String[] args) 
    {
        int utama = 1, ck = 21, srg, tot, gt = 0;
        while (utama<=5) 
        {
            srg = 1;
            tot = 0;
            do 
            {
                System.out.print(ck+"   ");
                tot = tot + ck;
                ck = ck + 1;
                srg = srg + 1;
            }
            while (srg<=5);
            System.out.println("  =  "+tot);
            gt = gt + tot;
            utama = utama + 1;
        }
        System.out.println("==================================  + ");
        System.out.println("  Total Keseluruhan        =  "+gt);
        System.out.println("");
        System.out.println("DONNY PRATAMA 202400116");
    }
}
