package com.systex.model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lottery {

	public static void main(String[] args) {
		
		// 檢查參數是否有樂透張數和要排除的號碼兩個
		if(args.length < 2) {
			System.out.println("請輸入正確格式，例如:2 \"5 25 30 33 42\"");
			return;
		}
		
		// 確認樂透張數合理
		int lottoCount = Integer.parseInt(args[0]);
		if(lottoCount <= 0){
			System.out.println("樂透張數最小值為1");
			return;
		}
		
		// 確認要排除的號碼
		Set<Integer> filterNum = new HashSet<>();
		String[] allNum = args[1].split(" ");
		for(String num:allNum) {
			int filterNumValue = Integer.parseInt(num);
			if(filterNumValue > 0 && filterNumValue <= 49) {
				filterNum.add(filterNumValue);
			}else {
				System.out.println("號碼請在1～49之間！");
				return;
			}
		}

		// 隨機生成排除指定號碼的樂透數字
		Random random = new Random();
		for(int i = 0; i < lottoCount; i++) {
			Set<Integer> lotto = new HashSet<>();
			while(lotto.size() < 6) {
				int randomNum = random.nextInt(49)+1;
				if(!filterNum.contains(randomNum)) {
					lotto.add(randomNum);
				}
			}
			System.out.println("第" + (i+1) + "組樂透號碼:" + lotto);
		}
	}	
}
