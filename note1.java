抛出异常
除了 Java 内置的类会抛出一些异常之外, 程序猿也可以手动抛出某个异常. 使用 throw 关键字完成这个操作.
在这个代码中, 我们可以根据实际情况来抛出需要的异常. 在构造异常对象同时可以指定一些描述性信息. 
public static void main(String[] args) { 
    System.out.println(divide(10, 0)); 
}
public static int divide(int x, int y) { 
    if (y == 0) { 
        throw new ArithmeticException("抛出除 0 异常"); 
    }
    return x / y; 
}
// 执行结果
 Exception in thread "main" java.lang.ArithmeticException: 抛出除 0 异常 at demo02.Test.divide(Test.java:14) at demo02.Test.main(Test.java:9)
