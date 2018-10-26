package model;

public class Employer {

    private String code;
    private String registrationNumber;
    private Double salary;
    private Double overtimeHours;
    private Integer degreeType;


    public Employer(String code,String registrationNumber,Double salary,Double overtimeHours,Integer degreeType){
        this.code = code;
        this.registrationNumber = registrationNumber;
        this.salary = salary;
        this.overtimeHours = overtimeHours;
        this.degreeType = degreeType;
   }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getRegistrationNumber(){
       return registrationNumber;
    }
    public Double getSalary(){
        return salary;
    }
    public
}
