public class Main {
	public static void main(String[] args) {
		//testing the default constructor
		CDList<Integer> test = new CDList<>();
		test.addLast(1);
		test.addLast(2);
		test.addLast(3);
		System.out.println(test);
		test.addFirst(4);
		System.out.println(test);
		test.removeFirst();
		System.out.println(test);
		test.removeLast();
		System.out.println(test);
	}
}
