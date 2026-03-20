package ExceptionHandling;

public class StaticExample extends Address {

    private static String name;
    private String id;

    static{
        name = "anshi";
        System.out.println(name);
    }

    public StaticExample(){

        System.out.println("StaticExample Constructor");
    };

    public void testMethod(){
        System.out.println(name);
    }
}
