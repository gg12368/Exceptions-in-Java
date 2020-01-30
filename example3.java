代码示例3 catch 只能处理对应种类的异常

我们修改了代码, 让代码抛出的是空指针异常. 
int[] arr = {1, 2, 3}; 
try {
    System.out.println("before"); 
    arr = null; 
    System.out.println(arr[100]); 
    System.out.println("after"); 
} catch (ArrayIndexOutOfBoundsException e) { 
    e.printStackTrace(); 
}
System.out.println("after try catch"); 
// 执行结果 
before Exception in thread "main" java.lang.NullPointerException at demo02.Test.main(Test.java:11)
此时, catch 语句不能捕获到刚才的空指针异常. 因为异常类型不匹配.
