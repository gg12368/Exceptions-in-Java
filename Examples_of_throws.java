//下面的方法实现了两个整数整除
public class TestDemo {
	public static int divide(int x, int y) throws Exception {
		int result = x / y;
		return result; // 将结果返回
	}

	public static void main(String[] args) {
		try {
			int result = divide(4, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获的异常信息为：" + e.getMessage());
		}
	}
}
