package socketchat;

public class Filter {
	
	private static final String NWORD[] = {"ɵ��", "�Բ�", "������", "������", "������", "ȥ����", "ɵȱ"};
	private static String replace = "*";
	
	public static String filt(String unreal) {
		// TODO Auto-generated method stub
		for (String i : NWORD) {
			unreal = unreal.replaceAll(i, replace.repeat(i.length()));
		}
		return unreal;
	}
}
