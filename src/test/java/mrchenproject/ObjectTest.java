package mrchenproject;


public class ObjectTest {
	int i = 3;
	public static void main(String[] args) {
		
		ObjectTest o = new ObjectTest();
		o.i=7;
		show(new ObjectTest());
		System.out.println(o.i+"");
		
	}
	public static void show(ObjectTest o) {
		o.i=6;
	}

}
