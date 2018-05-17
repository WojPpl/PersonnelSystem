package model.worker;

public class ManualWorker extends Worker implements WorkerFace {

    private Integer WorkedHours;
    private Integer AdditionalHours;
    private Worker Manager;
    private String[] Skills;

    public Integer getWorkedHours() {
        return WorkedHours;
    }

    public void setWorkedHours(Integer workedHours) {
        this.WorkedHours = workedHours;
    }

    public Integer getAdditionalHours() {
        return AdditionalHours;
    }

    public void setAdditionalHours(Integer additionalHours) {
        AdditionalHours = additionalHours;
    }

    public Worker getManager() {
        return Manager;
    }

    public void setManager(Worker manager) {
        Manager = manager;
    }

    public String[] getSkills() {
        return Skills;
    }

    public void setSkills(String[] skills) {
        Skills = skills;
    }

    public void CalculateSalary() {
        this.Salary = (this.PayBasis * this.WorkedHours) + (1.5 * this.PayBasis * this.AdditionalHours);
    }

    public void AdditionalInfo() {
        int size = this.getSkills().length;
        System.out.println("Uprawnienia: ");
        for (int i=0; i<size; i++)
        {
            System.out.println(this.Skills[i]);
        }
    }
}
