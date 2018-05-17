package model.worker;

public class Trainee extends Worker implements WorkerFace {

    private Worker Patron;
    private boolean Scholarship;

    public Worker getPatron() {
        return Patron;
    }

    public void setPatron(Worker patron) {
        Patron = patron;
    }

    public boolean isScholarship() {
        return Scholarship;
    }

    public void setScholarship(boolean scholarship) {
        Scholarship = scholarship;
    }

    public void AdditionalInfo() {
        System.out.println("Opiekun: " + this.Patron.getName() + " " + this.Patron.getSurname() + "\t|");
    }

    public void CalculateSalary() {
        if (this.Scholarship) {
            this.Salary = this.PayBasis;
        } else this.Salary = 0.00;
    }
}
