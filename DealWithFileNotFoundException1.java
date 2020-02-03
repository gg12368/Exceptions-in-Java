1.使用 try catch 包裹起来
public static void main(String[] args) { 
    System.out.println(readFile()); 
}
public static String readFile() { 
    File file = new File("d:/test.txt"); 
    Scanner sc = null; 
    try {
        sc = new Scanner(file); 
    } catch (FileNotFoundException e) { 
        e.printStackTrace(); 
    }
    return sc.nextLine(); 
}
