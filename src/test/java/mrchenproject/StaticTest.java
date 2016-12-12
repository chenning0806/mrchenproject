package mrchenproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.chen.org.bean.OrderParam;
import com.chen.org.bean.UserPO;

public class StaticTest {

	public static void main(String[] args) throws Exception {
		OrderParam orderParam = new OrderParam();
		List<OrderParam> list = new ArrayList<OrderParam>();
		list.add(orderParam);
		orderParam.setMsg("111");
		System.out.println(list.get(0).getMsg());
		
	}

}
