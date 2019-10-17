与throws有所不同的是，throw用于方法体内，并且抛出的是一个异常类对象，而throws关键字用在方法声明中，用来指明方法可能抛出的多个异常。
通过throw关键字抛出异常后，还需要使用throws关键字或try…catch对异常进行处理。需要注意，如果throw抛出的是Error、RuntimeException或它们的子类异常对象
，则无需使用throws关键字或try…catch对异常进行处理。

public class TestDemo {
	public static void printAge(int age) throws Exception {
		if (age <= 0) {
			throw new Exception("输入的年龄有误，必须是正整数");
		} else {
			System.out.println("此人年龄为：" + age);
		}
	}

	public static void main(String[] args) {
		int age = -1;
		try {
			printAge(age);
		} catch (Exception e) {
			System.out.println("捕获的异常信息为: " + e.getMessage());
		}
	}
}
