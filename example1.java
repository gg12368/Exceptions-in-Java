代码示例1 不处理异常
int[] arr = {1, 2, 3}; 
System.out.println("before"); 
System.out.println(arr[100]); 
System.out.println("after"); 
// 执行结果 
before Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
我们发现一旦出现异常, 程序就终止了. after 没有正确输出.
