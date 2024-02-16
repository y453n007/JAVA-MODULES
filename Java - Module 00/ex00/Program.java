public class Program {
	public static void main(String[] args) {
		int number = 479598;
		short ret = 0;

		ret += number % 10;
		number /= 10;
		ret += number % 10;
		number /= 10;
		ret += number % 10;
		number /= 10;
		ret += number % 10;
		number /= 10;
		ret += number % 10;
		number /= 10;
		ret += number;
		System.out.printf("%d\n", ret);
	}
}
