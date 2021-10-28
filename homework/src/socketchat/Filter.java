package socketchat;

public class Filter {
	
	private static final String NWORD[] = {"Éµ±Æ", "ÄÔ²Ğ", "ÈÕÄãÂè", "¸ÉÄãÄï", "²İÄàÂí", "È¥ÄãÂè", "ÉµÈ±"};
	private static String replace = "*";
	
	public static String filt(String unreal) {
		// TODO Auto-generated method stub
		for (String i : NWORD) {
			unreal = unreal.replaceAll(i, replace.repeat(i.length()));
		}
		return unreal;
	}
}
