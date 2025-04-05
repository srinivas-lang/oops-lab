
public class Bonus{
    public static void main(String[] args) {
        Department d;

        d = new HR();
        d.showBonus();

        d = new IT();
        d.showBonus();

        d = new Finance();
        d.showBonus();
    }
}

class Department {
    void showBonus() {
        System.out.println("General Department Bonus");
    }
}

class HR extends Department {
    @Override
    void showBonus() {
        System.out.println("HR Bonus: ₹25,000");
    }
}

class IT extends Department {
    @Override
    void showBonus() {
        System.out.println("IT Bonus: ₹40,000");
    }
}

class Finance extends Department {
    @Override
    void showBonus() {
        System.out.println("Finance Bonus: ₹30,000");
    }
}
