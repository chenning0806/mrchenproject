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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.chen.org.bean.UserPO;

public class StaticTest {

	public static void main(String[] args) throws Exception {
		String ss = "20160812-11-1,20160812-12-1,20160812-13-1,20160812-14-1,20160812-15-1";
		List<String> s = Arrays.asList(ss.split(","));
		String key = MessageFormat.format("member:UserService#getByUserId:{0}123017", 192679);
		System.out.println(key);
	}

}
