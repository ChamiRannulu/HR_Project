package Pojos;
// Generated Mar 14, 2020 5:08:16 PM by Hibernate Tools 4.3.1



/**
 * Staff generated by hbm2java
 */
public class Staff  implements java.io.Serializable {


     private Integer employeeId;
     private String fname;
     private String lname;
     private String gender;
     private String no;
     private String street;
     private String city;
     private String mobile;
     private String telephone;
     private String email;
     private String dateOfJoin;
     private String basicSalary;
     private int staffTypeStaffTypeid;
     private Boolean status;

    public Staff() {
    }

	
    public Staff(int staffTypeStaffTypeid) {
        this.staffTypeStaffTypeid = staffTypeStaffTypeid;
    }
    public Staff(String fname, String lname, String gender, String no, String street, String city, String mobile, String telephone, String email, String dateOfJoin, String basicSalary, int staffTypeStaffTypeid, Boolean status) {
       this.fname = fname;
       this.lname = lname;
       this.gender = gender;
       this.no = no;
       this.street = street;
       this.city = city;
       this.mobile = mobile;
       this.telephone = telephone;
       this.email = email;
       this.dateOfJoin = dateOfJoin;
       this.basicSalary = basicSalary;
       this.staffTypeStaffTypeid = staffTypeStaffTypeid;
       this.status = status;
    }
   
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getNo() {
        return this.no;
    }
    
    public void setNo(String no) {
        this.no = no;
    }
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDateOfJoin() {
        return this.dateOfJoin;
    }
    
    public void setDateOfJoin(String dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }
    public String getBasicSalary() {
        return this.basicSalary;
    }
    
    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }
    public int getStaffTypeStaffTypeid() {
        return this.staffTypeStaffTypeid;
    }
    
    public void setStaffTypeStaffTypeid(int staffTypeStaffTypeid) {
        this.staffTypeStaffTypeid = staffTypeStaffTypeid;
    }
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }




}


