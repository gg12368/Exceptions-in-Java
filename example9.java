代码示例9 如果向上一直传递都没有合适的方法处理异常, 最终就会交给 JVM 处理, 
程序就会异常终止(和我们最开始未使用 try catch 时是一样的).

public static void main(String[] args) { 
    func(); 
    System.out.println("after try catch");
}
public static void func() { 
    int[] arr = {1, 2, 3}; 
    System.out.println(arr[100]); 
}
// 执行结果 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100 at demo02.Test.func(Test.java:14) at demo02.Test.main(Test.java:8)
可以看到, 程序已经异常终止了, 没有执行到 System.out.println("after try catch"); 这一行.
