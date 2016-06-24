package mrchenproject;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.runner.manipulation.Sortable;

import sun.misc.*;

import com.alibaba.fastjson.util.Base64;
import com.chen.org.bean.UserPO;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {

		
		System.out.println(sort("11,11,12"));

		
	}
	private static String sort(String type){
        String[] strings = type.split(",");
        if(strings.length==1){
            return type;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(Integer.parseInt(strings[i]));
        }
        //排序
        Collections.sort(list);
        //去重
        for (int i = 0; i < list.size(); i++) {
            if(i==0){
                continue;
            }else{
                if(list.get(i)==list.get(i-1)){
                    list.remove(i);
                    i--;
                }
            }
        }
        String ll = list.toString();
        return ll.substring(1, ll.length()-1);
    }
}
