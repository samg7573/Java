package p003;

import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		String[] availableIDS=TimeZone.getAvailableIDs();
		for(String id:availableIDS) {
			System.out.println(id);
		}
	}

}
