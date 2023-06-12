package p009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Animal[] an=new Animal[4];

		int c=0;
		while(true) {
			System.out.print("1.개입력 2.고양이입력 3.새 입력 4.동물출력 0.종료:");
			int s=Integer.parseInt(sc.nextLine());
			if(s==1) {
				an[c]=new Dog();
				an[c].breathe();
				an[c].sound();
				an[c].disp();
				
			}else if(s==2) {
				an[c]=new Cat();
				an[c].breathe();
				an[c].sound();
				an[c].disp();
			}else if(s==3) {
				an[c]=new Bird();
				an[c].breathe();
				an[c].sound();
				an[c].disp();
			}else if(s==4) {
				for(Animal i:an) {
					if (i != null) {
					i.disp();	
					}
				}
			}else if(s==0) {
				System.out.println("프로그램 종료");
				break;
			}
			c++;
		}
	}
}