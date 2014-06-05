package praktikum09d.bin;

class PajakApply
{
	public static void main(String[] ErlanggaAchmad)
	{
		Pajak PJK = new Pajak(); //membuat objek
		PJK.Pendapatan = 6000000; //memberikan nilai
		PJK.Propinsi = "Bekasi";
		PJK.Kota = "Jati Asih - Bekasi";
		double PajakAnda = PJK.HitungPajak(); //menghitung Pajak
		
		PajakProp PJK01 = new PajakProp();
		double PajakAndaProp = PJK01.HitungPjkProp(PajakAnda);
		
		//menampilkan data pajak
		System.out.println("besar pajak anda sebesar Rp. " +PajakAnda);
		System.out.println("anda berada di propinsi " +PJK.Propinsi);
		System.out.println("anda di kota " +PJK.Kota);
		System.out.println("potongan pajak anda sebesar Rp. " +PajakAndaProp);
	}
}