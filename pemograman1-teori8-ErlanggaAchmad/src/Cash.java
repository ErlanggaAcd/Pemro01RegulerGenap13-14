// Created By ErlanggaAchmad
// Update : 19 Mei 2014

// Perintah Object Oriented Programming
package praktikum08a.bin;
import java.math.BigDecimal;

public class Cash extends Pembayaran
{
	private BigDecimal dibayar;
	private Transaksi transaksi;
	
	public BigDecimal getDibayar()
	{
		return dibayar;
	}
	public void setDibayar(BigDecimal x)
	{
		dibayar = x;
	}
	
	public BigDecimal hitungKembalian()
	{
		return transaksi.hitungTagihan().subtract(dibayar);
	}
}