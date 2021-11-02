package Pojos;
// Generated Mar 14, 2020 5:08:16 PM by Hibernate Tools 4.3.1



/**
 * SalaryShedule generated by hbm2java
 */
public class SalaryShedule  implements java.io.Serializable {


     private Integer salarySheduleId;
     private Integer staffId;
     private Double basicSalary;
     private Double overTimeAmount;
     private Double allowns;

    public SalaryShedule() {
    }

    public SalaryShedule(Integer staffId, Double basicSalary, Double overTimeAmount, Double allowns) {
       this.staffId = staffId;
       this.basicSalary = basicSalary;
       this.overTimeAmount = overTimeAmount;
       this.allowns = allowns;
    }
   
    public Integer getSalarySheduleId() {
        return this.salarySheduleId;
    }
    
    public void setSalarySheduleId(Integer salarySheduleId) {
        this.salarySheduleId = salarySheduleId;
    }
    public Integer getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
    public Double getBasicSalary() {
        return this.basicSalary;
    }
    
    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public Double getOverTimeAmount() {
        return this.overTimeAmount;
    }
    
    public void setOverTimeAmount(Double overTimeAmount) {
        this.overTimeAmount = overTimeAmount;
    }
    public Double getAllowns() {
        return this.allowns;
    }
    
    public void setAllowns(Double allowns) {
        this.allowns = allowns;
    }




}


