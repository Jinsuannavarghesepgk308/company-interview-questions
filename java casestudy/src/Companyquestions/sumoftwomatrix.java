package Companyquestions;
import java.util.Scanner;
public class sumoftwomatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);
System.out.println("Enter the rowsize");
int r= s.nextInt();
System.out.println("Enter the column");
int c = s.nextInt();
int[][] mat = new int[r][c];
int[][] mat1= new int[r][c];
int i,j;
System.out.println("Enter the elements for first matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
mat[i][j]= s.nextInt();
}
}
System.out.println("Enter the elements for second matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
mat1[i][j]= s.nextInt();
}
}
int[][] sum= new int[r][c];
System.out.println("Sum of matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
sum[i][j]=mat[i][j]+mat1[i][j];
System.out.println(sum[i][j]);
}
}


}

}