代码示例4 catch 可以有多个

int[] arr = {1, 2, 3}; 
try {
System.out.println("before"); 
arr = null; 
System.out.println(arr[100]);
System.out.println("after");
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("这是个数组下标越界异常");
e.printStackTrace();
} catch (NullPointerException e) { 
System.out.println("这是个空指针异常"); 
e.printStackTrace(); }
System.out.println("after try catch"); 
// 执行结果 before 这是个空指针异常 java.lang.NullPointerException at demo02.Test.main(Test.java:12) after try catch

一段代码可能会抛出多种不同的异常, 不同的异常有不同的处理方式. 因此可以搭配多个 catch 代码块.
如果多个异常的处理方式是完全相同, 也可以写成这样
catch (ArrayIndexOutOfBoundsException | NullPointerException e) { 
... 
}
