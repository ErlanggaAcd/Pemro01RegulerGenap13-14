package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain
{
	public static void main(String[] Rivai) throws ParseException
	{
		Student s = new Student();
		s.setNim("4512210010");
		s.setNama("ErlanggaAchmad");
		s.setAlamat("Jakarta");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("29-03-1994"));
		s.setNoHp("0896686807");
		
		Employee e = new Employee();
		e.setNip("12345678");
		e.setNama("Dadang");
		e.setAlamat("Bogor");
		e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("17-08-1945"));
		e.setNoHp("089999999888");
		
		showData(s);
		System.out.println("\n======================\n");
		showData(e);
	}
	
	static void showData(Student s)
	{
		System.out.println("Class Student");
		System.out.println("NIM : " + s.getNim());
		System.out.println("Nama : " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMMM yyyy").format(s.getTglLahir()));
		System.out.println("No Hp : " + s.getNoHp());
	}
	
	static void showData(Employee e)
	{
		System.out.println("Class Employee");
		System.out.println("NIP : " + e.getNip());
		System.out.println("Nama : " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMMM yyyy").format(e.getTglLahir()));
		System.out.println("No Hp : " + e.getNoHp());
	}
}