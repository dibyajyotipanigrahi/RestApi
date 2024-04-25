package in.ashokit.controller;

public class Student {
	private String name;
	private Integer id;
	private String email;

	public Student(String name, Integer id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
