代码示例5 也可以用一个 catch 捕获所有异常(不推荐) 

int[] arr = {1, 2, 3}; 
try {
    System.out.println("before"); 
    arr = null; 
    System.out.println(arr[100]); 
    System.out.println("after"); 
} catch (Exception e) { 
    e.printStackTrace(); 
}
System.out.println("after try catch"); 
// 执行结果 
before java.lang.NullPointerException at demo02.Test.main(Test.java:12) after try catch
由于 Exception 类是所有异常类的父类. 因此可以用这个类型表示捕捉所有异常.
备注: catch 进行类型匹配的时候, 不光会匹配相同类型的异常对象, 也会捕捉目标异常类型的子类对象.
如刚才的代码, NullPointerException 和 ArrayIndexOutOfBoundsException 都是 Exception 的子类, 因此
都能被捕获到.
