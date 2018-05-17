package sel1;

public class c4_String {

	public static void main(String[] args) {

		String s = "Welcome to Java Mentoring";
		String t = " welcome to java menotring ";

		System.out.println(s.charAt(6));

		System.out.println(s.indexOf("m"));

		System.out.println(s.compareTo(t));

		System.out.println(s.substring(8));

		System.out.println(s.substring(11, 15));

		System.out.println(s.contains("Java"));

		System.out.println(s.concat(t));

		System.out.println(s.equals(t));

		System.out.println(t.trim());

		System.out.println(s.replaceAll("Mentoring", "Presentation"));

		System.out.println(s.toLowerCase());

		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'w' || s.charAt(i) == 'W') {
				counter++;
			}
		}
		System.out.println(counter);

	}
}
