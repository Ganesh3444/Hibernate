package hibernateJavaBasedExmp.javaBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
// @Table(name = "Emp") // use this entity for change custom name of table .
public class Employee {

	@Id // for set this id is unique key.(primary key)
	@GeneratedValue(strategy = GenerationType.AUTO) // this is used for auto sequence of no of two tables or one(give them alternatively values)or
	// distributes value in two tables.
	
	// @SequenceGenerator(name = "mySequence", initialValue = 100, allocationSize = 2) // this is used for give random
																					// Sequence for other plant employees
																					// for unique no providing.
																					
	private int id;

	@Column(name = "empname", unique = true, nullable = false) // for set custom column name and set not nullable.
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
