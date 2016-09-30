package Day06Home_Extra.src.com.lanou;

public class Child extends Person {
	private Man father;
	private Woman mother;

	public Child() {
		super();
	}

	public Child(String name, String sex, int age) {
		super(name, sex, age);
		// TODO Auto-generated constructor stub
	}

	public Child(String name, String sex, int age, Man father, Woman mother) {
		super(name, sex, age);
		this.father = father;
		this.mother = mother;
	}

	public Man getFather() {
		return father;
	}

	public void setFather(Man father) {
		this.father = father;
	}

	public Woman getMother() {
		return mother;
	}

	public void setMother(Woman mother) {
		this.mother = mother;
	}

}
