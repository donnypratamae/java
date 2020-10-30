package pkg1p43;
public class donny21 {
    public static void main(String[] args) 
    {
        int ut=15, sp=15, sp1, ck, tot, gt=0;
        do 
        {
            sp1 = sp;
            ck = ut;
            tot = 0;
            while (sp1>=1) 
            {
                System.out.print(" ");
                sp1 = sp1 - 1;
            }
            do 
            {
                System.out.print(ck+" ");
                tot = tot + ck;
                ck = ck - 1;
            }
            while (ck>=15);
            System.out.println("  =  "+tot);
            gt = gt + tot;
            sp = sp - 3;
            ut = ut + 1;
        }
        while (ut<=19);
        System.out.println(" ========================== +  ");
        System.out.println("  TOTAL KESELURUHAN = "+gt);
        System.out.println("");
        System.out.println("DONNY PRATAMA 202400116");
    }
}
