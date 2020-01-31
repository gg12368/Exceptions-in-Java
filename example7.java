代码示例7 使用 try 负责回收资源

刚才的代码可以有一种等价写法, 将 Scanner 对象在 try 的 ( ) 中创建, 就能保证在 try 执行完毕后自动调用
Scanner 的 close 方法. 

try (Scanner sc = new Scanner(System.in)) { 
    int num = sc.nextInt(); 
    System.out.println("num = " + num); 
} catch (Exception e) {
    e.printStackTrace(); 
}

小技巧
IDEA 能自动检查我们的代码风格, 并给出一些更好的建议.
如我们之前写的代码, 在 try 上有一个 "加深底色" , 这时 IDEA 针对我们的代码提出了一些更好的建议.
此时把光标放在 try 上悬停, 会给出原因. 按下 alt + en
