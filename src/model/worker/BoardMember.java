package model.worker;

public class BoardMember extends Worker implements WorkerFace {

    private Worker Assistant;
    private Integer NumberofMeetings;
    private Double MeetingSalary;

    public Worker getAssistant() {
        return Assistant;
    }

    public void setAssistant(Worker assistant) {
        Assistant = assistant;
    }

    public Integer getNumberofMeetings() {
        return NumberofMeetings;
    }

    public void setNumberofMeetings(Integer numberofMeetings) {
        NumberofMeetings = numberofMeetings;
    }

    public Double getMeetingSalary() {
        return MeetingSalary;
    }


    public void AdditionalInfo() {
        System.out.println("Asystent: " + this.Assistant.getName() + " " + this.Assistant.getSurname() + "\t|");
    }

    public void setMeetingSalary(Double meetingSalary) {
        MeetingSalary = meetingSalary;
    }

    public void CalculateSalary() {
        this.Salary = this.PayBasis + (this.NumberofMeetings * this.MeetingSalary);
    }
}
