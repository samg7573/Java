package ch11;

public class p471 {

	public static void main(String[] args) {
		String[]array = {"100","1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			}catch(ArrayIndexOutOfBoundsException|NumberFormatException e) {
				System.out.println("배열 인덱스가 초과됨: "+e.getMessage());
			}catch(Exception e) {
				System.out.println("실행에 문제가 있습니다.: "+e.getMessage());
			}
		}

	}

}

	