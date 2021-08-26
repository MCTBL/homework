package socketchat;

public class Filter {
	
	static private String sensitiveWords[]= {"²Ù","ÄãÂè","Éµ±Æ","ÄÔ²Ğ","ÈõÖÇ"};
	
	static public String Filt(String temp) {
		
		for(String i:sensitiveWords) {
			
			if(temp.contains(i)) {
				temp=temp.replaceAll(i, "*");
			}
			
		}
		
		return temp;
	}
}
