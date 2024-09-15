package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

import com.systex.model.MyDate;

public class Sorting {

	public static void main(String[] args) {
		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(13,9,2024));
		dates.add(new MyDate(13,8,2020));
		dates.add(new MyDate(5,12,2019));
		dates.add(new MyDate(8,10,2025));
		dates.add(new MyDate(25,2,2030));
		dates.add(new MyDate(30,1,2008));
		dates.add(new MyDate(20,4,2008));
		dates.add(new MyDate(22,3,2004));
		dates.add(new MyDate(17,7,2012));
		dates.add(new MyDate(14,9,2024));
		
		if(args.length == 0) {
			System.out.println("輸入無效，不可空白！");
		}else if(args[0].equals("1")) {
			System.out.println("============ 升冪排序 ============");
			Collections.sort(dates);
			dates.forEach(d->System.out.println(d));
		}else if(args[0].equals("-1")) {
			System.out.println("============ 降冪排序 ============");
			Collections.sort(dates,Collections.reverseOrder());
			dates.forEach(d->System.out.println(d));
		}else{
			System.out.println("輸入無效，僅可輸入升冪(1)或降冪(-1)");
		}
	}

}