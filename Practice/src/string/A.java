package string;

import java.util.Arrays;

public class A {

	static StringBuffer sb= new StringBuffer();
	static StringBuffer sbb= new StringBuffer();
	static int index=0;
	public static void main(String[] args) {
		
		String s = "i am here";
		char[] c = s.toCharArray();
		int l = c.length;
		reverse(c,l);
		//System.out.println(Arrays.toString(values));
	}
	
	public static void reverse(char[] r, int l) {
		
		 wholeStringReverse(r,l);
		 System.out.println(sb);
		 String newString = sb.toString();
		 sb = new StringBuffer();
		 String[] c = newString.split(" ");
		 int sl = c.length;
		 reverseIndexwise(c,sl);
		 System.out.println(sbb);
	}


	private static void reverseIndexwise(String[] c, int sl) {
			if(sl>index) {
				String s = c[index];
				index++;
				char[] cc = s.toCharArray();
				wholeStringReverse(cc,cc.length);
				sbb = sbb.append(sb);
				sbb.append(" ");
				sb=new StringBuffer();
				//sl--;
				reverseIndexwise(c,sl);

			}		
	}

	public  static void wholeStringReverse(char[] r, int l) {
		
		if(l>0) {
			sb=sb.append(r[l-1]);
			wholeStringReverse(r, --l);
		}
		
	}


	
}
