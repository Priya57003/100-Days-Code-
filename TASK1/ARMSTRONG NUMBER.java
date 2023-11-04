import java.util.*;

public class Main {
  public static int armstrong(int n,int sum) {
    int temp = n;

    if (n == 0) {
      return sum;
    } else 
    {
      int rem = n % 10;
      sum = sum + (rem * rem * rem);
      return armstrong(n / 10,sum);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0;
    System.out.print(armstrong(n,sum));
  }
}
