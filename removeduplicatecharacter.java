
public class removeduplicatecharacter {

	public static void main(String[] args) {

String str = "ababcabbaccaabb";
System.out.println("old string is: "+str);
System.out.println("New string is: "+removeDupliChar(str));
	}

	public static String removeDupliChar(String str) {
		String newStr="";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(newStr.indexOf(ch)==-1) {
				newStr+=ch;
				 
			}
		}
		return newStr;
	}
}
