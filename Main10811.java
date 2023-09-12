import java.util.Scanner;

public class Main10811 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // 바구니의 개수
    int[] bracket = new int[n];

    // 바구니 초기화
    for (int i = 0; i < n; i++) { 
      bracket[i] = i+1;
    }

    int m = sc.nextInt(); // 순서를 역순으로 바꾸는 횟수

    for (int i = 0; i < m; i++) { 
      int leftNum  = sc.nextInt()-1; // 배열 인덱스로 바꾸기 위해 -1
      int rightNum = sc.nextInt()-1;

      while (true) {
        // 맨 앞과 맨 뒤 바구니의 순서를 바꿈
        int tmp = bracket[leftNum];
        bracket[leftNum] = bracket[rightNum];
        bracket[rightNum] = tmp;

        // 범위 좁히기
        leftNum++;
        rightNum--;
        if (leftNum >= rightNum) break; // 바꿀 필요가 없어지는 경우에 종료
      }
    }
    sc.close();

    // 결과 출력
    for (int i = 0; i < n; i++) {
      System.out.print(bracket[i]);
      if (i == n-1) break;
      System.out.print(" ");
    }
  }
}
