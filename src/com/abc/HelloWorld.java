package com.abc;

public class HelloWorld {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		// TODO
		String driver="Lucas";
		System.out.println(driver+" to BJ");
		
		/*int a=1;
		int b=(int)2.11;
		String aa="30";
		System.out.println(a+aa);
		System.out.println(b);*/
		
		char c='中';
		char d='国';
		System.out.println(c+0+"_"+(int)'国');
		
		int e=10;
		int f=11;
		System.out.println(e%f);
		System.out.println(f%e);
		
		char a='a';
		switch(a)
		{
			case 'a': System.out.println('a');
				break;
			case 'b': System.out.println('b');
				break;
			default: System.out.println('c');
		}
		
		int i=0;
		while(i<100) {
			if(i%2==1) {
				System.out.println(i);
			}
			i++;
		}
	} 	
}
