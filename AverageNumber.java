import java.security.cert.PKIXCertPathBuilderResult;

/*Accept N number from user and store it in array and find average number from that array*/
import java.util.*;

public class AverageNumber 
{
    public static void main(String[] args) 
    {
      int iNum=0;
      int iCnt=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of elements of array");
      iNum=sc.nextInt();

      int arr[]=new int[iNum];
      System.out.println("Enter Array Elments : ");
      for(iCnt=0;iCnt<iNum;iCnt++)
      {
            arr[iCnt]=sc.nextInt();
      }

      int avg=arr[0];

      for(iCnt=0;iCnt<iNum;iCnt++)
      {
          avg=avg+arr[iCnt];
      }
      avg=avg/iNum;

      System.out.println("Average is :"+avg);
    }

}
