package praktikum12d.bin;
public class point extends Shape {
     static int x, y;
	 public point() {
	      x = 0;
		  y = 0;
	 }
	 public double area() {
           return 0;
     }
     public static void print() {
           System.out.println("point: " + x + "," + y);
     }
     public static void main (String[] Erlangga) {
           point p = new point();
           p.print();
    }
}	
	