import model.Employer;

public class Main {

    public static void main(String[] args) {
        Employer employer1 = new Employer("1000", "14013", 1000.0, 6.0, 1);
        Employer employer2 = new Employer("1000", "14013", 1200.0, 8.0, 3);

        employer1.setCode("1000");
        System.out.println(Employer.showTelikosMisthos(employer1));
        System.out.println(Employer.showTelikosMisthos(employer2));

    }
}

