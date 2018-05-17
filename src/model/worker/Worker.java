package model.worker;

import java.util.Date;

public class Worker implements WorkerFace {

    protected String Name;
    protected String Surname;
    protected Date Birthyear;
    protected Double Salary;
    protected Double PayBasis;

    public void CalculateSalary() {
    }

    public void BasicInfo(){
        System.out.println(this.getName()+" "+this.getSurname()+"\t|"
                + "Urodzony: "+this.getBirthyear() +"\t|"
                + "Pensja: "+this.getSalary() +"\t|");
    }

    public void AdditionalInfo(){

    }

    public Date getBirthyear() {
        return Birthyear;
    }

    public void setBirthyear(Date birthyear) {
        Birthyear = birthyear;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Double getPayBasis() {
        return PayBasis;
    }

    public void setPayBasis(Double payBasis) {
        PayBasis = payBasis;
    }
}
