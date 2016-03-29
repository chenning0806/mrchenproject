package mrchenproject;

public class ThreadTest {

	public static void main(String[] args)
    {
       int i=1;
       switch(i)
       {
             case 1:
              System.out.println(i+1);
             case 2:
              System.out.println(i+1);
             case 3:
              System.out.println(i+1);    
             case 4:
              System.out.println(i+1);
              break;
             default:
              System.out.println("other");
       }
   }

}
