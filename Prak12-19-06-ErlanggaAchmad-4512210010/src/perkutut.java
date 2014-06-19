package praktikum12a.bin;

class Perkutut extends Hewan {
      public Perkutut () 
	  {
	       super ("perkutut",2,true);
	  }
	  public void bersuara () {
	        System.out.println ("\ncuit, cuit, cuit");
	  }
	  public static void main (String[] Erlangga) {
	       Perkutut P = new Perkutut();
		   P.isHewan ();
		   P.bersuara();
		}
}
		