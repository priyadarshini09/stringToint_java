package guru.springframework.blog;

import java.text.DecimalFormat;
import java.text.ParseException;

public class ConvertStringToInt {
    public static void main(String args[]){
       String stringNumber = "123";
       String binaryNumber = "1111";
       DecimalFormat decimalFormat = new DecimalFormat("#");
       try {
           /*parseInt()*/
           int number = Integer.parseInt(stringNumber);
           System.out.println("The number is : " + number);

           /*valueOf*/
           int number1 = Integer.valueOf(stringNumber);
           System.out.println("The number is : " + number1);

           /*Integer(String).intValue()*/
           int number2 = new Integer(stringNumber).intValue();
           System.out.println("The number is : "+number2);

           /*DecimalFormat class*/
           int number3 =  decimalFormat.parse(stringNumber).intValue();
           System.out.println("The number is : "+number3);

           /*special radix*/
           int binary1 = Integer.parseInt(binaryNumber,2);
           int binary2 = Integer.valueOf(binaryNumber, 2);
           System.out.println("The binary value using parseInt() is: "+binary1);
           System.out.println("The binary value using valueOf() is: "+binary2);

       }catch(NumberFormatException ex){
           System.out.println("The exception is "+ex);
       }catch (ParseException e){
           System.out.println("The exception is "+e);
       }
    }
}
