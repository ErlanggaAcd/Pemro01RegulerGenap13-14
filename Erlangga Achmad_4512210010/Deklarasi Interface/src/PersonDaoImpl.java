//created by: Erlangga Achmad
//data		: 4 April 2014

public class PersonDaoImpl implements PersonDao{
	public void save(Person p){
		System.out.println("Menyinpan Person");
	}
	public void delete(Person p){
		System.out.println("Menghapus Person");
	}
	public Person getById(Long id){
		Person p = new Person();
		p.setId(id);
		p.setNama("abc");
		return p;
	}
}


//Analisa: 

//Penjelasan: