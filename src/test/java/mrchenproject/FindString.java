package mrchenproject;

import java.text.MessageFormat;

public class FindString {

	public static void main(String[] args) {
		
		String string = "qwe{img}dfsfd{img}sfsdl{img}skv{img}kl{img}1111{img}";
		
		int i = 0;
		
		while(true){
			
			String ss = string.replaceFirst("\\{img\\}", "\\{"+i+"\\}");
			
			if(string.equals(ss)){
				
				break;
				
			}
			
			string = ss;
			
			i++;
		}
		MessageFormat messageFormat = new MessageFormat(string);
		String w =  messageFormat.format(new String[]{"11","22","33"});
		System.out.println(w);
//		System.out.println(ss);
//		String ss2 = ss.replaceFirst("\\{img\\}", "\\{1\\}");
//		System.out.println(ss2);
//		String ss3 = ss2.replaceFirst("\\{img\\}", "\\{1\\}");
//		System.out.println(ss3);
//		System.out.println(ss[1]);
//		System.out.println(ss[2]);
	
	}

}
