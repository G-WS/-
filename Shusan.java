import java.util.Scanner;

public class Shusan {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("请输入数字三角形的行数");
	int n=in.nextInt();
	int [][]b=new int [n][n];
	int max=0;
	int [][]a=new int[n][n];
	for(int i=0;i<n;i++) {
		System.out.println("请输入数字三角形第"+(i+1)+"行的数据信息");
		for(int j=0;j<=i;j++) {
			b[i][j]=0;
			a[i][j]=in.nextInt();
			if(i==n-1) {
				b[i][j]=a[i][j];
			}
		}
	}
	
	int i1,t2;
	for(int i=n-2;i>=0;i--) {
		for(int j=0;j<=i;j++) {
			if(b[i+1][j]>b[i+1][j+1]) {
				b[i][j]=a[i][j]+b[i+1][j];
			}
			else {
				b[i][j]=a[i][j]+b[i+1][j+1];
			}
		}
	}
	System.out.println("最大路径和为"+b[0][0]);
	
	}
}
