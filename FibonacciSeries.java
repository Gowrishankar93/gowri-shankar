package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
      
		int firstNum=0, secNum=1,sum=0;
		
		System.out.print(firstNum+"  " +secNum);
		
		for(int i=2;i<=8;i++)
		{
			sum=firstNum+secNum;
			System.out.print(" "+sum);
			firstNum=secNum;
			secNum=sum;
			
			
			
		}
	}

}
