package com.bhasker.dgstack.coreprg;
public class StringImmutable {
	
	public static void main(String[] args) {
		
		String s1="Java";
		
		String s2="Java";
		
		System.out.println("S1 ="+s1);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("Java");
		
		s3=s3.intern();
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
