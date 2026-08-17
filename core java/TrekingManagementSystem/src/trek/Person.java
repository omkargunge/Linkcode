package trek;

public abstract class Person {

	private String name;
	private String mobile;

	Person(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}

	abstract void display();

}
