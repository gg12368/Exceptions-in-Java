代码示例8 如果本方法中没有合适的处理异常的方式, 就会沿着调用栈向上传递

public static void main(String[] args) { 
    try {
        func(); 
    } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace(); 
    }
    System.out.println("after try catch"); 
}
public static void func() { 
    int[] arr = {1, 2, 3}; 
    System.out.println(arr[100]); 
}
// 直接结果 
java.lang.ArrayIndexOutOfBoundsException: 100 at demo02.Test.func(Test.java:18) at demo02.Test.main(Test.java:9) after try catch
