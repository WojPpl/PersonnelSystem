package model.worker;

public class WhiteCollar extends Worker implements WorkerFace {

    private Integer BonusPercent;
    private Worker Manager;
    private String Phone;
    private String RoomNo;

    public Integer getBonusPercent() {
        return BonusPercent;
    }

    public void setBonusPercent(Integer bonusPercent) {
        BonusPercent = bonusPercent;
    }

    public Worker getManager() {
        return Manager;
    }

    public void setManager(Worker manager) {
        Manager = manager;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }

    public void AdditionalInfo() {
        System.out.println("Kierownik: " + this.Manager.getName() + " " + this.Manager.getSurname() + "\t|"
                + "Telefon: "+this.getPhone() +"\t|"
                + "Pokój: "+this.getRoomNo() +"\t|");
    }

    public void CalculateSalary() {
        this.Salary = this.PayBasis + (this.BonusPercent * this.PayBasis / 100);
    }
}
