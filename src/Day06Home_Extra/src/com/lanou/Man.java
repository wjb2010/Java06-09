package Day06Home_Extra.src.com.lanou;

public class Man extends Person {
	private Woman wife;// 妻子的类型是Woman
	private Child son; // 儿子的类型是Child

	public Man() {
		super();
	}

	
	
	public Man(String name, String sex, int age) {
		super(name, sex, age);
		// TODO Auto-generated constructor stub
	}



	public Man(String name, String sex, int age, Woman wife, Child son) {
		super(name, sex, age);
		this.wife = wife;
		this.son = son;
	}

	public Woman getWife() {
		return wife;
	}

	public void setWife(Woman wife) {
		this.wife = wife;
	}

	public Child getSon() {
		return son;
	}

	public void setSon(Child son) {
		this.son = son;
	}

}
