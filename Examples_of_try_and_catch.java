//下面的方法实现了两个整数整除
public class TestDemo {
	public static int divide(int x, int y) {
		try {
			int result = x / y;
			return result; // 将结果返回
		} catch (Exception e) {
			System.out.println("捕获的异常信息为：" + e.getMessage());
		} finally {
			System.out.println("执行finally代码块，无论程序是否异常，都会执行");
		}
		return -1; // 定义当程序发生异常直接返回-1
	}

	public static void main(String[] args) {
		int result = divide(4, 0);
		if (result == -1) { // 对调用方法结果进行判断
			System.out.println("程序发生异常");
		} else {
			System.out.println(result);
		}
	}
}
