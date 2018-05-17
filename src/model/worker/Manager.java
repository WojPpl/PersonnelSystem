package model.worker;

public class Manager extends Worker implements WorkerFace {

    private Integer BonusPercent;
    private Double AddSalary;
    private String Phone;
    private String Mobile;
    private String RoomNo;
    private String Department;

    public Integer getBonusPercent() {
        return BonusPercent;
    }

    public void setBonusPercent(Integer bonusPercent) {
        BonusPercent = bonusPercent;
    }

    public Double getAddSalary() {
        return AddSalary;
    }

    public void setAddSalary(Double addSalary) {
        AddSalary = addSalary;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void CalculateSalary() {
        this.Salary = (this.PayBasis + (this.BonusPercent/100 * this.PayBasis)) * (this.PayBasis + this.AddSalary);
    }

    public void AdditionalInfo() {
        System.out.println(this.Phone+" | "+this.Mobile+" | "+this.RoomNo+" | "+this.Department);
    }
}
