//created by: Erlangga Achmad
//data		: 22 April 2014

//perintah control flow/struktur kontrol
//perintah kelima - contoh 05
package Latihan01.sesi1.bin;
import java.util.Random;

public class DemoJump
{
	public static void main(String[] Erlangga_Achmad)
	{
		Integer faktor =7;
		System.out.println("mencari kelipatan " +faktor + " dengan break");
		while (true)
		{
			Integer random = new Random().nextInt();
			System.out.println("bilangan random : " +random);
			
			if(random % faktor == 0)
			{
				System.out.println("kelipatan " +faktor + " ditemukan yaitu : " +random);
				break;
			}
		}
	}
}