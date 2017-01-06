package practice01;

public class Prob5 {

	public static void main(String[] args) {		

		for(int i=1;i<100;i++){
			String s=String.valueOf(i);			
			int count=0;
			for(int j=0;j<s.length();j++){

				if(s.charAt(j)=='3' || s.charAt(j)=='6' || s.charAt(j)=='9'){
					count++;
				}				
			}
			if(count==0)
				continue;

			System.out.print(i+" ");

			for(int j=0;j<count;j++){
				System.out.print("짝");
			}
			System.out.println();
		}

		//		for(int i=1;i<100;i++){
		//
		//			if(i<10 && i%3==0) //3,6,9를 출력하기 위한 조건
		//				System.out.println(i+" 짝");
		//
		//			else if(i%10==3 ||i%10==6 ||i%10==9){   //1의자리가 3 or 6 or 9일 조건
		//
		//				if(i/10==3 || i/10==6 || i/10==9){  //10의 자리가 3 or 6 or 9일 조건
		//					System.out.println(i+" 짝짝");   //두 조건 만족시 10과 1의 자리가 둘다 3 or 6 or 9				 
		//				}
		//				else
		//					System.out.println(i+" 짝");     // 10의 자리 or 1의 자리가 3 or 6 or 9
		//			}
		//
		//			else if(i/10==3 || i/10==6 || i/10==9){ //10의 자리가 3 or 6 or 9 일 조건
		//				if(i%3!=0)							//1의 자리가 3 or6 or 9가 아닐 조건
		//					System.out.println(i+" 짝"); 
		//			}
		//		}
	}
}
