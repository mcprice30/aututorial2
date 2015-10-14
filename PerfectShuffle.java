import java.util.*;

public class PerfectShuffle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

     while(true) {
      
      int num = in.nextInt();
      
      if (num == 0) {
        return;
      }

      String[] input = new String[num];

      for (int i = 0; i < num; i++) {
        input[i] = in.next();
      }
	
      String[] strings = new String[num];
        
      for (int i = 0; i < num / 2 + num % 2; i++) {
        strings[i * 2] = input[i]; 
      }

      for (int i = 0; i < num / 2; i++) {
        strings[i * 2 + 1] = input[i + num / 2 + num % 2]; 
      }

      for (String s : strings) {
        System.out.println(s);
      }

    }
  }  
}
