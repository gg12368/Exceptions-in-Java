代码示例6 finally 表示最后的善后工作, 例如释放资源

int[] arr = {1, 2, 3}; 
try {
    System.out.println("before"); 
    arr = null; 
    System.out.println(arr[100]); 
    System.out.println("after"); 
} catch (Exception e) {
    e.printStackTrace(); 
} finally { 
    System.out.println("finally code"); 
}
// 执行结果 
before java.lang.NullPointerException at demo02.Test.main(Test.java:12) finally code
无论是否存在异常, finally 中的代码一定都会执行到. 保证最终一定会执行到 Scanner 的 close 方法.
