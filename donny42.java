package pkg1p43;
import javax.swing.*;
public class donny42 {
    public static String laporan, ket, grade;
    public static float sem_ipk = 0f, sem=0f, tot_ipk=0f, rata_nil=0f , rata_ipk=0f;
    public static int uji, x , ll =0 , tl=0 , z = 0, tot_nil=0;
    public static void main (String[] args)
    {
       String nama[]= null;
       nama = new String[8];
       
       int nilai[]; nilai = new int[8];
       float ipk[]; ipk = new float[8];

       x =- 1;
       boolean lanjut = true, lewat = true;
       String lapor="",lagi ="y";

       do
       {
           x = x +1;
           String hasil = "";
           String nm = JOptionPane.showInputDialog("NAMA MAHASISWA ");
           nama[x] = nm;

           do
           {
            try
            {
                do
                {
                    String nu = JOptionPane.showInputDialog("NILAI UJIAN (0-100) ");
                    uji = Integer.parseInt(nu);
                    lanjut = false;
                }while (!(uji >= 0 & uji <= 100));
            }catch (Exception e)
            {
                lanjut = true;
                JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
            }
           }
           while (lanjut);
           nilai[x] = uji;

           if (uji <=30)
           {
               grade ="E";
           }
           else if ( uji <=59)
           {
               grade = "D";
           }
           else if (uji <=70)
           {
               grade ="C";
           }else if (uji <=80)
           {
               grade ="B";
           }
           else
           {
               grade ="A";
           }
           
           do
           {
               
               try
               {
                   do
                   {
                       String sem = JOptionPane.showInputDialog("IPK SEMESTER [0-4.00] ");
                       sem_ipk = Float.parseFloat(sem);
                       lewat = false;
                   }
                   while (!(sem_ipk >= 0 & sem_ipk <= 4.00));
               }
               catch (Exception e)
                   {
                      lewat = true;
                      JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
                   }
           }
           while (lewat);
           ipk[x] = sem_ipk;
           
           if (sem_ipk >=2.00)
           {
               ket ="LULUS";
           }
           else
           {
               ket = "TIDAK LULUS";
           }

           hasil += "HASIL DATA MAHASISWA \n NAMA = "+ nama[x]+"\n"
                 + " NILAI = "+ nilai[x]+"\n GRADE = "+ grade +"\n IPK = "+ ipk[x]+"\n KET "+ket;
           JOptionPane.showMessageDialog(null,hasil,"DATA MAHASISWA",JOptionPane.INFORMATION_MESSAGE);

           do
           {
               
               lagi = JOptionPane.showInputDialog("INPUT DATA [Y/T] ");
           }
           while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi))));

       }
       while (("y".equals(lagi)) | ("Y".equals(lagi)));
       z = 0;
       lapor += " LAPORAN HASIL PENILAIAN MAHAS \n ==================================================\n"
             + " NO NAMA NILAI GRADE IPK KETERANGAN \n ==================================================\n";
       
       for (int y=0; y<=x; y=y+1)
       {
           z = z + 1;
           if (nilai[y] <=30)
           {
               grade ="E";
           }
           else if (nilai[y] <=59)
           {
               grade = "D";
           }
           else if (nilai[y] <=70)
           {
               grade ="C";
           }
           else if (nilai[y] <=80)
           {
               grade ="B";
           }
           else
           {
               grade ="A";
           }

           if (ipk[y] >=2.00)
           {
               ket ="LULUS"; ll = ll + 1;
           }
           else
           {
               ket = "TIDAK LULUS"; tl = tl + 1;
           }
           
           tot_nil = tot_nil + nilai[y];
           tot_ipk = tot_ipk + ipk[y];
           lapor += " "+z+" "+nama[y]+" " +nilai[y]+" "+grade+" "+ipk[y]+" "+ket+"\n";
       }
        rata_nil = tot_nil /z;
        rata_ipk = tot_ipk / z;

        lapor += " ==================================================\n RATA RATA NILAI = "+rata_nil+" \n"
              + " RATA RATA IPK = "+rata_ipk+" \n LULUS = "+ll +"\n TIDAK LULUS = "+tl +"\n"
              + " ==================================================\n";
        JOptionPane.showMessageDialog(null,lapor,"LAPORAN HASIL DATA MAHASISWA",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
       }
}