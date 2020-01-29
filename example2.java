代码示例2 使用 try catch 后的程序执行过程
int[] arr = {1, 2, 3}; 
try {
    System.out.println("before"); 
    System.out.println(arr[100]); 
    System.out.println("after"); 
} catch (ArrayIndexOutOfBoundsException e) {
    // 打印出现异常的调用栈
    e.printStackTrace(); 
}
System.out.println("after try catch"); 
// 执行结果 
before java.lang.ArrayIndexOutOfBoundsException: 100 at demo02.Test.main(Test.java:10) after try catch
