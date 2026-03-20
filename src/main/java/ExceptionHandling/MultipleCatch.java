package ExceptionHandling;

public class MultipleCatch {

    public void multipleCatchBlock(){

        try {
            //1. Airthmetic exception
//            int result = 100/0;


            //2. NumberFormatException
//            String s = "123 ";
//            int x = Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
        catch (ArithmeticException a) {
            a.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
