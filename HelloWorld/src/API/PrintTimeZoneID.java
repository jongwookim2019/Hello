package API;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availaberIDs = TimeZone.getAvailableIDs();
		for (String id : availaberIDs) {
			System.out.println(id);
		}
	}
}
