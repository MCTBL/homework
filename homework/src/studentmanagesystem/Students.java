package studentmanagesystem;


public class Students {

	//包括ID，姓名，联系电话，宿舍号，班级
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
		return "学生："+name+" 学号："+id+" 联系方式："+phonenumber+
				" 宿舍为："+dormno+" 班级是："+classno;
	}
}
