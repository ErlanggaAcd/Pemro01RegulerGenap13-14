package praktikum12e.bin;
public class TestMobil {
    public static void main(String[] Erlangga){
	       Mobil mobil = new Mobil(){
	public void injakPedalGas(){
	      System.out.println("Mobil berjalan.....");
	}
	};
	    kijang kijang = new kijang();
		BMW bmw = new BMW();
		
		mobil.injakPedalGas();
		
		mobil= kijang;
		mobil.injakPedalGas();
		mobil= bmw;
		mobil.injakPedalGas();
	}
}