public class WhileLoopPractice2 {
   public static void main(String[] args){
      
      int balance = 10;
      
      while(balance >= 1 ){
         if(balance < 9)
            continue;
         balance = balance - 9;
      }
      System.out.print(balance);
   }
}