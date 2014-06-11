package praktikum10.bin;

public class View
{
	public static void main(String[] Erlangga)
	{
		Employee e = new Employee("Rivai",5000000);
		Employee em = new Manager("Rivai",5000000,"Informatika");
		System.out.println("data employee :\n" +e.getDetails());
		System.out.println("data manager :\n" +em.getDetails());
		em.cetak();
	}
}