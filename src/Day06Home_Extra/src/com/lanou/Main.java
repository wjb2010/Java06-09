package Day06Home_Extra.src.com.lanou;

public class Main {
	public static void main(String[] args) {
		// Family，Man，Woman等哪一个类
		// 都是Model类，属于模型
		// 它们只可以进行定义和规定功能与特征
		// 但是无法执行赋值，创建对象这些操作
		
		// 赋值和创建对象这些功能
		// 只有controler控制器可以进行
		// 因此：我们在Main主方法中完成对象的创建，赋值
		// 通过set方法传入每一个类让那个类去使用
		
		// 控制器(主方法)是造物者
		
		// 神说要有男人
		Man man = new Man("隔壁老陈", "男", 18);
		// 神说这个男人太孤独了，来个女的吧！
		Woman woman = new Woman("朱芳芳", "女", 21);
		// 神说我给他捏个小孩玩吧
		Child child = new Child("吴方块", "男", 44);
		
		// 现在他看隔壁老陈和朱芳芳眉来眼去
		// 神把朱芳芳送给了老陈
		man.setWife(woman);
		// 朱芳芳有主了
		woman.setHusband(man);
		// 神说把吴方块给你俩，当你俩儿子
		man.setSon(child);
		woman.setSon(child);
		// 吴方块很开心，有了爸爸和妈妈
		child.setFather(man);
		child.setMother(woman);
		
		// 神说：复杂的逻辑关系组建完毕
		// 你们三个人可以一起生活了
		Family family = new Family();
		family.setFather(man);
		family.setMother(woman);
		family.setSon(child);
		
		family.party();
		
		// 隔壁老陈怀疑他的妻子出轨
		// 雇佣了一个侦探调查一下他妻子的社会关系
		String wifeName = man.getWife().getName();
		// 上方代码的复杂版
//		Woman a = man.getWife();
//		String name = a.getName();
		
		String sonName = man.getWife()
				.getHusband().getSon().getName();
		System.out.println(sonName);
		
		// 突然有一天，村子里来了一个土匪山大王
		Man strongMan = new 
				Man("吴大师", "男", 18, woman, child);
		
		
		
		
		
		
		
		
		
		
	}
}
