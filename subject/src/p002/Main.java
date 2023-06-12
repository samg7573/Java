package p002;

import java.util.List;
import java.util.Scanner;

public class Main {
	private static String id;
	private static String pwd;
	private static String name;
	private static String email;
	
	private static String newid;
	private static String newpwd;
	private static String newname;
	private static String newemail;
	static Scanner sc = new Scanner(System.in);
	public static void input() {
		System.out.println("아이디:");
		id=sc.nextLine();
		System.out.println("비밀번호:");
		pwd=sc.nextLine();
	}
	public static void input2() {
		System.out.println("아이디:");
		id=sc.nextLine();
		System.out.println("비밀번호:");
		pwd=sc.nextLine();
		System.out.println("이름:");
		name=sc.nextLine();
		System.out.println("이메일:");
		email=sc.nextLine();
	}
	public static void input3() {
		System.out.println("아이디:");
		newid=sc.nextLine();
		System.out.println("비밀번호:");
		newpwd=sc.nextLine();
		System.out.println("이름:");
		newname=sc.nextLine();
		System.out.println("이메일:");
		newemail=sc.nextLine();
	}
	
	
	public static void main(String[] args) {
		Daomanager manager = new Daomanager();
		while(true) {
			System.out.println("1.회원가입 2.회원전체출력 3.로그인 "+
								"4.회원삭제 5.회원수정 6.테스트용 입력 0.종료");
			int s=Integer.parseInt(sc.nextLine());
			if(s==0)break;
			if(s==1) {
				input2();
				Member member = new Member(id, pwd, name, email);
				manager.insert((member));
			}else if(s==2) {
				List<Member> li=manager.getList();
				for(Member i:li) {
					System.out.println(i.toString()); //toString 안붙여도됨
					
				}
			}else if(s==3) {
				input();
				boolean ok=manager.isLogin(id, pwd);
				if(ok)System.out.println("로그인 성공");
				else System.out.println("로그인 실패");
			}else if(s==4) {
					input();
					manager.delete(id, pwd);
			}else if(s==5) {
					input3();
					manager.update(newid,newpwd,newname,newemail);
					Member member = new Member(newid,newpwd,newname,newemail);
					member.setId(newid);
					member.setPwd(newpwd);
					member.setName(newname);
					member.setEmail(newemail);
			}else if(s==6) {
				Member member = new Member("apple","1234","홍길동","aaa@bb.cc");
				manager.insert((member));
				member = new Member("play00","1434","김철수","bbb@bb.cc");
				manager.insert((member));
				member = new Member("sky007","1234","이영희","ccc@bb.cc");
				manager.insert((member));
			}
		}
		System.out.println("프로그램종료.");

	}

}
