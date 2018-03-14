package math;

import java.util.Optional;
import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib3(10));
	}

	static long fib1(int n) {
		if (n <= 1)
			return n;
		return fib1(n - 1) + fib1(n - 2);
	}

	static long fib2(int n) {
		if (n <= 1) {
			return n;
		}
		int fibo = 1;
		int fiboPrev = 1;
		for (int i = 2; i < n; ++i) {
			int temp = fibo;
			fibo += fiboPrev;
			fiboPrev = temp;
		}
		return fibo;
	}

	static long fib3(int series) {
		Optional<Long> maxLong = Stream.iterate(new long[] { 0, 1 }, s -> new long[] { s[1], s[0] + s[1] }).limit(series + 1)
				.map(n -> n[0]).reduce(Long::max);
		return maxLong.get();
	}

}
