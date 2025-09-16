// Angela Vargas CSD402 10.2 Programming Assignment - Domestic Division

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName +
                "\nAccount Number: " + accountNumber +
                "\nState: " + state + "\n");
    }
}