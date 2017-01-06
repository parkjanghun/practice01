package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int num=sc.nextInt();
		int sum=0;

		if(num%2==0){ //짝수 인 경우
			for(int i=0;i<=num;i++){
				if(i%2==0) //짝수만 판별하여 합을 구한다
					sum+=i;
			}
			System.out.println(sum);
		}
		else{ //홀수 인 경우
			for(int i=0;i<=num;i++){
				if(i%2!=0) //홀수만 판별하여 합을 구한다
					sum+=i;
			}
			System.out.println(sum);
		}
	}

}
