// Angela Vargas CSD402 10.2 Programming Assignment - International Division

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisionName +
                "\nAccount Number: " + accountNumber +
                "\nCountry: " + country +
                "\nLanguage: " + language + "\n");
    }
}