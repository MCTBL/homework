package studentmanagesystem;


public class Students {

	//����ID����������ϵ�绰������ţ��༶
	private String id;
	private String name;
	private String phonenumber;
	private String dormno;
	private String classno;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getDormno() {
		return dormno;
	}
	public void setDormno(String dormno) {
		this.dormno = dormno;
	}
	public String getClassno() {
		return classno;
	}
	public void setClassno(String classno) {
		this.classno = classno;
	}
	
	public Students(String id, String name, String phonenumber, String dormno, String classno) {
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.dormno = dormno;
		this.classno = classno;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ѧ����"+name+" ѧ�ţ�"+id+" ��ϵ��ʽ��"+phonenumber+
				" ����Ϊ��"+dormno+" �༶�ǣ�"+classno;
	}
}
