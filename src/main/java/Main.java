// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
  }
  
  public static String convNumToWords(int num){
    int onesDigit = num%10;
    int tensDigit = (num%100 - num%10)/10;
    int hundsDigit = (num%1000 - num%100)/100;
    int thousDigit = (num%10000 - num%1000)/1000;
    /*string numbers*/
    String[] ones = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] tens = new String[]{"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String[] teens = new String[]{"", "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    if(tensDigit==1 && onesDigit!=0){
      String strNum = teens[onesDigit];
      strNum = ones[hundsDigit]+"hundred"+strNum;
      return strNum;
    }else{
      String strNum = tens[tensDigit] + ones[onesDigit];
      strNum = ones[hundsDigit]+"hundred"+strNum;
      return strNum;
      
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}