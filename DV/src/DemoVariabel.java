//Created by Erlangga Achmad

package Praktikum03d.bin;


public class DemoVariabel {
   public static void main (String[] ErlanggaAchmad) {
   int x=10;
   System.out.println("Nilai X adalah " +x);
   
   char z='a';
   System.out.println("Nilai Z adalah " +z);
   
   //isi data ke tipe yang tidak tepat
   int y=z;
   System.out.println("Nilai Y adalah " +y);
   
   //tidak bisa compile (error)
   //char w=x;
   //System.out.println("Nilai W adalah " +x);
   
   //tipe casting
   char v=(char) x;
   System.out.println("Nilai Y adalah " +y);
   System.out.println("Baris Selanjutnya");
  }
  public static void coba(){
   //System.out.println("nilai V adalah " +v);
}
}