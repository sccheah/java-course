package people;

public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
    }

    public String credits() {
        return Integer.toString(credits);
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\n    credits " + credits;
        return str;
    }

    public void study() {
        credits++;
    }

    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println( olli );
        olli.study();
        System.out.println( olli );
    }
}