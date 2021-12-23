package collection_framework;

public class RemoveNumericInString {

	public static void main(String args[]) {
		String str="Ha23i HEl89lo";
		str=str.replaceAll("[0-9]","");
		System.out.println(str);
}
}
