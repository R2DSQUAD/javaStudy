package org.java.oop;

public class ConstruceExMain {
	public static void main(String[] args) {
		ConstruceEx cal = new ConstruceEx(10, 20, new Operator("+")); 
		int num1=cal.getNum1();
		int num2=cal.getNum2();
		
		System.out.println(cal.getOpearator().getOp());
		Operator oper = cal.getOpearator();
		String op=oper.getOp()
;
		
		if(op.equals("+")) {
			System.out.println(num1+num2);
		}
		
		ConstruceEx cal2 = new ConstruceEx();
		cal2.setOpearator(new Operator("-"));
		Operator oper2 = cal2.getOpearator();
		String op2 = oper2.getOp();
		
		System.out.println(op2)
		;
		
	}
}
