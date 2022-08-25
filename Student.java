package ibu.edu.hw9;


public class Student {
	int studentID;
	int studentYearOfEnrolment;
	String studentName;
	String dateOfBirth;
	String uniName;
	String departmentCode;
	String departmentName;
	
	
	public Student(int studentID, String studentName, String dateOfBirth, String uniName, String departmentCode,
			String departmentName, int studentYearOfEnrolment) {
		this.studentID = studentID;
		this.studentYearOfEnrolment = studentYearOfEnrolment;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.uniName = uniName;
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
	
	}
	public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public int getStudentYearOfEnrolment() {
    	return studentYearOfEnrolment;
    }
    public void setStudentYearOfEnrolment(int yearOfEnrolment) {
    	this.studentYearOfEnrolment = studentYearOfEnrolment;
    }
    public String getStudentName() {
    	return studentName;
    }
    public void setStudentName(String studentName) {
    	this.studentName = studentName;
    }
    public String getDateOfBirth() {
    	return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
    	this.dateOfBirth = dateOfBirth;
    }
    public String getUniName() {
    	return uniName; 
    }
    public void setUniName(String uniName) {
    	this.uniName = uniName;
    }
    public String getDepartmentCode() {
    	return this.departmentCode;
    }
    public void setDepartementCode(String departmentCode) {
    	this.departmentCode = departmentCode;
    }
    public String getDepartmentName() {
    	return departmentName;
    }
    public void setDepertmentName(String departmentName) {
    	this.departmentName = departmentName;
    }
 	public String toString() {
	        return "\n" + "Student ID: " + this.studentID + "\n" + "Name and surname: " + this.studentName + "\n" + "Date of birth: " + this.dateOfBirth + "\n" + "University: " + this.uniName
	                + "\n" + "Department code: " + this.departmentCode + "\n" + "Department: " + this.departmentName + "\n" + "Year of enrolment: " + this.studentYearOfEnrolment + "\n\n";
	    }
}


