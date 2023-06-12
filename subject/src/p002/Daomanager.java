package p002;

import java.util.*;


public class Daomanager {
	ArrayList<Member> li=new ArrayList<Member>();
	public void insert(Member member) {
		li.add(member);
		System.out.println("회원가입 성공.");
	}
	public List<Member> getList(){
		return li;
	}
	public boolean isLogin(String id,String pw) {
		System.out.println("===>"+id+": "+pw);
		for(Member m:li) {
			if(m.getId().equals(id)) {
				System.out.println("--->"+pw+": "+m.getPwd());
				if(pw.equals(m.getPwd()))return true;
			}
		}
		return false;
	}
	public void delete(String id,String pw) {
		for(Member m:li) {
			if(m.getId().equals(id)) {
				if(pw.equals(m.getPwd())) {
					li.remove(m);
					System.out.println("삭제성공.");
					return;
				}
			}
		}
		System.out.println("삭제실패.");
	}
	public void update(String id, String pw,String name,String email) {
	    for (Member m : li) {
	        if (m.getId().equals(id)) {
	            if (pw.equals(m.getPwd())) {
	                System.out.println("회원변경");
	                m.setId(id); // 아이디 변경
	                m.setPwd(pw); // 비밀번호 변경
	            	m.setName(name);  // 이름 변경
	                m.setEmail(email);  // 이메일 변경
	                return;
				}
			}
		}
	    System.out.println("회원정보 불일치");
	}
	
}
