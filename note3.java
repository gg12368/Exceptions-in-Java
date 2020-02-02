关于 finally 的注意事项
finally 中的代码保证一定会执行到. 这也会带来一些麻烦.
public static void main(String[] args) { 
    System.out.println(func()); 
}
public static int func() { 
try {
    return 10; 
} finally {
    return 20; 
    } 
}
// 执行结果 20
