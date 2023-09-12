import java.util.Scanner;

public class Main5597 {
  public static void main(String[] args) {
    
    int[] studentNumbers = new int[30];
    for(int i=0; i<studentNumbers.length; i++) {
      studentNumbers[i] = i+1;
    }

    Scanner sc = new Scanner(System.in);

    for(int i=0; i<28; i++) {
      studentNumbers[sc.nextInt()-1] = 0;
    }

    int count = 0;
    for(int i=0; i<studentNumbers.length; i++) {
      if (studentNumbers[i] == 0) continue;
      if (count > 1) break;
      System.out.println(studentNumbers[i]);
      count++;
    }
  }
}