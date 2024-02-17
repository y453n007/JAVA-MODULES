public class Program {
	public static void	main(String[] args) {
		byte	ret = 0;
		int		number = 479598;

		ret += (byte) (number % 10);
		number /= 10;
		ret += (byte) (number % 10);
		number /= 10;
		ret += (byte) (number % 10);
		number /= 10;
		ret += (byte) (number % 10);
		number /= 10;
		ret += (byte) (number % 10);
		number /= 10;
		ret += (byte) number;
		System.out.println(ret);
	}
}
