package mrchenproject;

public class SingleTon {
	private SingleTon(){}
	
	private static SingleTon singleTon = null;

	public static SingleTon getInstans() {
		if(singleTon==null){
			synchronized (SingleTon.class) {
				if(singleTon==null){
					singleTon = new SingleTon();
				}
			}
		}
		return singleTon;
	}
}
