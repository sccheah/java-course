import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> borrowers;

    public PromissoryNote() {
        borrowers = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        borrowers.put(toWhom, value);
    } 

    public double howMuchIsTheDebt(String whose) {
        return borrowers.get(whose);
    }
    
    public static void main(String[] args) {
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
    }
}