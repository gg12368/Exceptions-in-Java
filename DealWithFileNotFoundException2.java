b) 在方法上加上异常说明, 相当于将处理动作交给上级调用者

public static void main(String[] args) { 
    try {
        System.out.println(readFile()); 
    } catch (FileNotFoundException e) { 
        e.printStackTrace(); 
    } 
}
public static String readFile() throws FileNotFoundException {
    File file = new File("d:/test.txt"); 
    Scanner sc = new Scanner(file); 
    return sc.nextLine(); 
}
