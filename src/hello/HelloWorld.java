package hello;

/*
 * ver1.0 2019/01/24 Takayuki5689
 * 
 */

import org.joda.time.LocalTime;

public class HelloWorld {

	public static void main(String[] args) {
	
		//Acquisition of the current time
		LocalTime cirrentTime = new LocalTime();
		//It displays the current time
		System.out.println(cirrentTime);
		
		Greeter greeter= new Greeter();
		//Display of "Hello World!!"
		System.out.println(greeter.Hello());		
		
	}
}