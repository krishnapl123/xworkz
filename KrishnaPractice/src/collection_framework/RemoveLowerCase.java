package collection_framework;

public class RemoveLowerCase {

	public static void main(String args[]) {
		String str="Hai HEllo";
		str=str.replaceAll("[a-z]","");
		System.out.println(str);
	}
}
