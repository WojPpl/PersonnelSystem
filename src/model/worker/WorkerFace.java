package model.worker;

import java.util.Date;

public interface WorkerFace {

    public void CalculateSalary();
    public void BasicInfo();
    public void AdditionalInfo();
    public Date getBirthyear();
    public void setBirthyear(Date birthyear);
    public String getName();
    public void setName(String name);
    public String getSurname();
    public void setSurname(String surname);
    public Double getSalary();
    public void setSalary(Double salary);
    public Double getPayBasis();
    public void setPayBasis(Double payBasis);

}
