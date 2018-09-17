package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Life extends Insurance {

    public Life() {
        super("Life Insurance");
    }

    @Override
    public void setCost() {
        monthlyPrice = 36;
    }

    @Override
    public void display() {
        System.out.println(getInsuranceType() + " >>>> Monthly Fee: " + getMonthlyPrice());
    }
}