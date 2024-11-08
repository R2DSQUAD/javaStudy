package org.java.condition;

public class Edu {
	
	//변수 아님 필드(속성, 프로퍼티)
	public int kor, eng, math, sum; //인스턴스 멤버
	public double avg; //인스턴스 멤버
	
	//생성자 ->construct
	public Edu(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	// 메서드 -> 인스턴스 메서드
	public String gradeMethod() {
		String grade = "";
		
		sum=kor+eng+math; //총 점 계산
		avg=sum/(double)3;
		
		if(avg >= 90) {
			if(avg >= 95) {
				grade=("A+");
			}else {
				grade=("A");
			}
		}else if(avg >= 80) {
			if(avg >= 85) {
				grade=("B+");
			}else {
				grade=("B");
			}
		}else if(avg >= 70) {
			if(avg >= 75) {
				grade=("C+");
			}else {
				grade=("C");
			}
		}else if(avg >= 60) {
			if(avg >= 65) {
				grade=("D+");
			}else {
				grade=("D");
			}
		}else {
			grade=("F");
		}
		
		return grade;
		
	}
	
	@Override
	public String toString() {
		return "국어: "+kor+" 영어: " +eng+" 수학: " +math;
	}
}
