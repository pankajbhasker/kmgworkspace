package com.bhasker.dgstack.coreprg;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class StringCompare {
	public static void main(String[] args) {

		
        
		String s5 = new String("chandra");
		String s6 = new String("chandra");
		System.out.println(s5.equals(s6));
		System.out.println(s5==s6);
		
		System.out.println();

		String s3 = "chandra";
		String s4 = "chandra";
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		System.out.println();
		
		StringBuffer s1 = new StringBuffer("chandra");
		StringBuffer s2 = new StringBuffer("chandra");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		

	}
}
