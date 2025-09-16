// Angela Vargas CSD402 10.2 Programming Assignment - Division

abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}