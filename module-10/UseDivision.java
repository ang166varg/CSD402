// Angela Vargas CSD402 10.2 Programming Assignment - USe Division

public class UseDivision {
    public static void main(String[] args) {
        // Create 2 InternationalDivision objects
        InternationalDivision intl1 = new InternationalDivision("Pacific Innovations", 3001, "Australia", "English");
        InternationalDivision intl2 = new InternationalDivision("Andes Tech Solutions", 3002, "Chile", "Spanish");

        // Create 2 DomesticDivision objects
        DomesticDivision dom1 = new DomesticDivision("Midwest Manufacturing", 4001, "Illinois");
        DomesticDivision dom2 = new DomesticDivision("Southern Distribution", 4002, "Texas");

        // Display info
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}