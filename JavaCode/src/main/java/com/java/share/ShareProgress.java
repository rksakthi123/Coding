package com.java.share;

import java.util.ArrayList;
import java.util.List;

public class ShareProgress {

	public static void main(String[] args) {
		String[] data= {"10","11","12","11.5","9.9","8.9","10","12","11","15"};

	}
	
	public void UpDownPeriod(String[] data,int delta) {
		double start=0;
		double down=0;
		double up=0;
		int index=0;
		int days1=0,days2;
		List<Integer> listStartToUpDays=new ArrayList<Integer>();
		List<Integer> listStartToDownDays=new ArrayList<Integer>();
		List<Integer> listUpToStartDays=new ArrayList<Integer>();
		List<Integer> listDownToStartDays=new ArrayList<Integer>();
		List<Integer> listDownToUpDays=new ArrayList<Integer>();
		List<Integer> listUpToDownDays=new ArrayList<Integer>();
		for(String value:data) {
			double doubleValue=Double.parseDouble(value);
			if(index==0) {
				start=doubleValue;
				up=doubleValue;
				down=doubleValue;
			}
			else {
				if(doubleValue>start&&doubleValue>up) {  // start to up
					up=doubleValue;
				}
				else if(doubleValue<start&&doubleValue<down) {    //Up to start
					down=doubleValue;
					days1=0;
				}
			}
			days1++;
			index++;
		}
	}

}
