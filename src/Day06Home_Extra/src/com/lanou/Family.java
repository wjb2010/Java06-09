package Day06Home_Extra.src.com.lanou;

public class Family {
	private Man father;
	// 家庭中有一个男人，职位是
	private Woman mother;
	private Child son;
	int b = 6;
	
	public Family() {
		super();
	}
	
	public Family(Man father, Woman mother, Child son) {
		super();
		this.father = father;
		this.mother = mother;
		this.son = son;
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
	public Child getSon() {
		return son;
	}
	public void setSon(Child son) {
		this.son = son;
	}
	
	// 聚会方法
	public void party() {
		System.out.println("男人是:" + father.getName());
		System.out.println("女人是:" + mother.getName());
		System.out.println("孩子是:" + son.getName());
		System.out.println("一起出去开party");
	}
	
	
	
	
	
	
	
	
	
	
}
