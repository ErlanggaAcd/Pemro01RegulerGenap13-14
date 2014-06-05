//Perintah Inheritance
package Praktikum09b.bin;

public class TesKucing
{
	private static int Jumlah;
	public static void main(String[] petrus)
	{
		Jumlah = 1;
		//Kucing Makan
		KucingMakan KM = new KucingMakan();
		System.out.println("Masukan Nama Kucing Kesayangan Anda [" +Jumlah +"] : ");
		KM.setNama(KucingMakan.inputDataString());
		System.out.println("Masukan Umur Kucing Kesayangan Anda [" +Jumlah +"] : ");
		KM.setUmur(KucingMakan.inputDataInteger());
		System.out.println("Masukan Makanan Kucing Kesayangan Anda [" +Jumlah +"] : ");
		KM.setMakan(KucingMakan.inputDataString());
		Jumlah++;
		//JmlAnakKucing
		JmlAnakKucing JAK = new JmlAnakKucing();
		System.out.println("Masukan Nama Kucing Kesayangan Anda [" +Jumlah +"] : ");
		JAK.setNama(KucingMakan.inputDataString());
		
		System.out.println("Masukan Umur Kucing Kesayangan Anda [" +Jumlah +"] : ");
		JAK.setUmur(KucingMakan.inputDataInteger());
		
		System.out.println("Masukan Berat Kucing Kesayangan Anda [" +Jumlah +"] : ");
		JAK.setMakan(KucingMakan.inputDataInteger());
		
		System.out.println("Masukan Makanan Kucing Kesayangan Anda [" +Jumlah +"] : ");
		JAK.setNama(KucingMakan.inputDataString());
		
		System.out.println("Masukan Jumlah Anak Kucing Anda [" +Jumlah +"] : ");
		JAK.setUmur(KucingMakan.inputDataInteger());
		
		//Menampilkan Data Kucing
		System.out.println("\n\n Data Kucing ");
		KM.Tulis();
		System.out.println("Makanan Kucing Anda : " +KM.getMakanan());
		KM.Tulis();
		System.out.println("Makanan Kucing Anda : " +JAK.getMakanan());
		System.out.println("Jumlah Anak Kucing  : " +JAK.getJumlahAnak());
		
		
	}
}