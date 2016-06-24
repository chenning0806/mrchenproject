package mrchenproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.inject.New;

public class FileWriterTest {

	public static void main(String[] args) throws Exception{

	List<Integer> list = new ArrayList<Integer>();
	list.add(2);
	list.add(2);
	list.add(2);
	list.add(2);
//	list.add(2);
//	list.add(2);
//	list.add(3);
//	list.add(4);
//	list.add(5);
//	list.add(5);
//	list.add(6);
//	list.add(7);
//	list.add(8);
//	list.add(9);
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
		System.out.println(list);
	}

}
