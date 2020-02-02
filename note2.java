异常说明
我们在处理异常的时候, 通常希望知道这段代码中究竟会出现哪些可能的异常.
我们可以使用 throws 关键字, 把可能抛出的异常显式的标注在方法定义的位置. 从而提醒调用者要注意捕获这些异
常.
public static int divide(int x, int y) throws ArithmeticException { 
if (y == 0) { 
    throw new ArithmeticException("抛出除 0 异常"); 
}
return x / y; 
}
