import model.Employer;

public class Main {

    public static void main(String[] args) {
        Employer employer1 = new Employer("1000", "14013", 1000.0, 6.0, 1);
        Employer employer2 = new Employer("1000", "14013", 1200.0, 8.0, 3);

        employer1.setCode("1000");
        System.out.println(showTelikosMisthos(employer1));
        System.out.println(showTelikosMisthos(employer2));


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

