访问null对象

public class Test { 
  public int num = 10; 
  public static void main(String[] args) { 
    Test t = null; 
    System.out.println(t.num); 
  } 
}
// 执行结果
Exception in thread "main" java.lang.NullPointerException
