// javac app.java - создание исполняемого файла bin.
// java -classpath . app - запуск исполняемого файла bin.
// javac -d bin src/HelloWorld.java - разделяем исходный файл от bin, прежде создаем  две папки bin src
// java -classpath ./bin HelloWorld - запуск файла из каталога.

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