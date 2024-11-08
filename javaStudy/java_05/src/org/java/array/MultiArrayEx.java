package org.java.array;

public class MultiArrayEx {
	public static void main(String[] args) {
		System.out.println("다차원 배열 예제\n\n");
		int[][] score = { 
				{ 100, 80, 68 }, 
				{ 60, 80, 58 }, 
				{ 70, 84, 92 }, 
				{ 96, 67, 73 }, 
				{ 98, 94, 63 } 
			};

		int kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0.0;

		System.out.println("============= 중간 / 기말 고사 성적표 =============");
		System.out.println("----------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총합\t평균");
		System.out.println("----------------------------------------------");
		
		for(int i=0; i<score.length; i++) {
			System.out.print(i);
			int sum2=0;
			double avg2=0.0;
			for(int j=0; j<score[i].length; j++) {
				
				sum2 += score[i][j];
				avg2 = sum2/(double)3;
				System.out.print("\t"+score[i][j]);
			}
			System.out.print("\t"+sum2);
			System.out.print("\t"+String.format("%.2f",avg2));
			System.out.println();
			kor += score[i][0];
			eng += score[i][1];
			math += score[i][2];
			
			sum+=sum2;
		}
		int size=score.length*score[0].length;
		String avgStr=String.format("%.2f", (double)sum/size);
		
		System.out.println("----------------------------------------------");
		System.out.println("과목별\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avgStr);
		System.out.println("----------------------------------------------");
	}
}
