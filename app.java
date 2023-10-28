public class app{
    public static void main(String [] args){
        System.out.println("Speed test run Java!");
        double a = 3.1415926; 
        double b = 2.718;
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000000; i++){
            a = a + b;
        }
        long end = System.currentTimeMillis();
        System.out.println("Java: " + (end-start) + "ms");
        System.out.println((int)(a));
    }
}