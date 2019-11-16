package Companyquestions;
import java.util.Scanner;
public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int tot_num;
		
		
		int[]n=new int[] {1,2,3,4,5,6,7};
		
		tot_num=7;
		int expected_num_sum=tot_num*((tot_num+1)/2);
int num_sum=0;
for(int i=1;i<=n;i++)
{
	num_sum+=i;
	
}
System.out.println(expected_num_sum-num_sum);
	}

}
