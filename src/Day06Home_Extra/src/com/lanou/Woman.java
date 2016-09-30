package Day06Home_Extra.src.com.lanou;

public class Woman extends Person {
	private Man husband;
	private Child son;

	public Woman() {
		super();
	}
	

	public Woman(String name, String sex, int age) {
		super(name, sex, age);
		// TODO Auto-generated constructor stub
	}


	public Woman(String name, String sex, int age, Man husband, Child son) {
		super(name, sex, age);
		this.husband = husband;
		this.son = son;
	}

	public Man getHusband() {
		return husband;
	}

	public void setHusband(Man husband) {
		this.husband = husband;
	}

	public Child getSon() {
		return son;
	}

	public void setSon(Child son) {
		this.son = son;
	}

}
