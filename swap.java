public class swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
//public static void main(String[] args) {
//    int a = 10, b = 20;
//    System.out.println("Before swap: a = " + a + ", b = " + b);   
//    temp=a;
//    a=b;
//    b=temp;
//    System.out.println("After swap: a = " + a + ", b = " + b);
//} 

// using temp
