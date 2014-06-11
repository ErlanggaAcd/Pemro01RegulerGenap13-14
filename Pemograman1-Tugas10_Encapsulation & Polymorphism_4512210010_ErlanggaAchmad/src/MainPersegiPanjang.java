package praktikum10.bin;

public class MainPersegiPanjang
{
	public static void main(String[] Erlangga)
	{
		PersegiPanjang pp = new PersegiPanjang();
		pp.setPanjang(10);
		pp.setLebar(20);
		System.out.println("panjang : "+ pp.getPanjang());
		System.out.println("lebar : "+ pp.getLebar());
		System.out.println("luas : "+ pp.getLuas());
	}
}