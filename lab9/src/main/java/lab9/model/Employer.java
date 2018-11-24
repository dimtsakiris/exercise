package lab9.model;

public class Employer {

    private String code;
    private String registrationNumber;
    private Double salary;
    private Double overtimeHours;
    private Integer degreeType;


    public Employer(String code, String registrationNumber, Double salary, Double overtimeHours, Integer degreeType) {
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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public Double getOvertimeHours() {
        return overtimeHours;

    }

    public Integer getDegreeType() {
        return degreeType;

    }

    public static Double showTelikosMisthos(Employer employer) {
        Double overtimeTemp = 0.;
        if (employer.getOvertimeHours() >= 1) {
            overtimeTemp = employer.getOvertimeHours() * 20;

        }
        if (employer.getDegreeType() == 1) {
            overtimeTemp += 300.;
        } else if (employer.getDegreeType() == 2) {
            overtimeTemp = overtimeTemp + 150.;
        } else if (employer.getDegreeType() == 3) {
            overtimeTemp += 100.;
        } else if (employer.getDegreeType() == 4) {
            overtimeTemp += 50.;
        } else {
            overtimeTemp += 0.;
        }
        Double showTelikosMisthos = employer.getSalary() + overtimeTemp;
        return showTelikosMisthos;
    }
}