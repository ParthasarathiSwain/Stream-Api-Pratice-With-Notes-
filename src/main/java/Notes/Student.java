package StreamApi;

public class Student {
	private int stdid,fee;
	private String name,subject;
	
	public Student() {
	}

	public Student(int stdid, String name, String subject, int fee) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", subject=" + subject + ", fee=" + fee + "]";
	}
	
	
}
