//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        int[] arr={2,2,3};

        try{
               System.out.println(arr[4]);
               int num = arr[2] / (arr[0]-arr[1]);
               System.out.println(num);
        }
        catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Exception Caught: "+ e);
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught: Division by 0");
        }
        finally{
            System.out.println("Existing try-catch block");
        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}