package org.java.condition;

public class Quiz6_Sub {
	public String queryType;
	
	public Quiz6_Sub(String query) {
		this.queryType=query;
		
	}
	
	public String queryMethod() {
		
		String query ="";
		
		if (queryType.equals("insert") || queryType.equals("update") || queryType.equals("select") || queryType.equals("delete")) {
			if(queryType.equals("insert")) {
				query=("회원가입 페이지로 이동합니다.");
			}else if(queryType.equals("update")) {
				query=("회원수정 페이지로 이동합니다.");
			}else if(queryType.equals("select")) {
				query=("회원조회 페이지로 이동합니다.");
			}else if(queryType.equals("delete")) {
				query=("회원탈퇴 페이지로 이동합니다.");
			}
		}else {
			query=("쿼리문 입력 오류 입니다.");
		}		
		
		return query;
	}	
}
