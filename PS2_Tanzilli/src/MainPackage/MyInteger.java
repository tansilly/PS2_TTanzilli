package MainPackage;

public class MyInteger {

	// creating in data field
	private int Value;

	// get method
	public int getValue() {
		return Value;
	}

	// constructor
	private void setValue(int Value) {
		this.Value = Value;
	}

	// set method
	public MyInteger(int Value) {
		setValue(Value);
	}

	// is even instance
	public boolean isEven() {
		if (this.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// is odd instance
	public boolean isOdd() {
		if (this.getValue() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// test prime instance
	public boolean isPrime() {
		boolean testPrime = true;
		for (int divisor = 2; divisor <= this.getValue() / 2; divisor++) {
			if (this.getValue() % divisor == 0) {
				testPrime = false;
			}
		}
		return testPrime;
	}

	// test even static for some int
	public static boolean isEven(int Value) {
		if (Value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// test odd static for some int
	public static boolean isOdd(int Value) {
		if (Value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// test prime static for some int
	public static boolean isPrime(int Value) {
		boolean testPrime = true;
		for (int divisor = 2; divisor <= Value / 2; divisor++) {
			if (Value % divisor == 0) {
				testPrime = false;
			}
		}
		return testPrime;
	}

	// test even static for MyInteger
	public static boolean isEven(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// test off static for MyInteger
	public static boolean isOdd(MyInteger myInt) {
		if (myInt.getValue() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// test prime static for MyInteger
	public static boolean isPrime(MyInteger myInt) {
		boolean testPrime = true;
		for (int divisor = 2; divisor <= myInt.getValue() / 2; divisor++) {
			if (myInt.getValue() % divisor == 0) {
				testPrime = false;
			}
		}
		return testPrime;
	}

	// test if equal for some int
	public boolean equals(int Value) {
		if (Value == this.getValue()) {
			return true;
		} else {
			return false;
		}
	}

	// test if equal for MyInteger
	public boolean equals(MyInteger myInt) {
		return equals(myInt.getValue());
	}

	// static string to int converter
	public static int parseInt(String someString) {
		return Integer.parseInt(someString);
	}

	// static array to int converter
	public static int parseInt(char[] someArray) {
		return parseInt(new String(someArray));
	}

}
