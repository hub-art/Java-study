package come.heima.test0523;

public class Tree {
    String type;
    int age;

    public Tree() {}

    public Tree(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void fruit() {
        System.out.println("This tree produces fruit.");
    }
}

class Peach extends Tree {
    String region;

    public Peach() {}

    public Peach(String type, int age, String region) {
        super(type, age);
        this.region = region;
    }

    @Override
    public void fruit() {
        System.out.println("This peach tree produces peaches.");
    }

    public void flower() {
        System.out.println("This peach tree has beautiful flowers.");
    }
}

class Pear extends Tree {
    String region;

    public Pear() {}

    public Pear(String type, int age, String region) {
        super(type, age);
        this.region = region;
    }

    @Override
    public void fruit() {
        System.out.println("This pear tree produces pears.");
    }

    public void fallIll() {
        System.out.println("This pear tree is sick.");
    }
}

class TestTree {
    public static void callMethod(Tree tree) {
        if (tree instanceof Peach) {
            Peach peach = (Peach) tree;
            peach.fruit();
            peach.flower();
        } else if (tree instanceof Pear) {
            Pear pear = (Pear) tree;
            pear.fruit();
            pear.fallIll();
        } else {
            tree.fruit();
        }
    }

    public static void main(String[] args) {
        Tree peachTree = new Peach("peach", 5, "California");
        Tree pearTree = new Pear("pear", 8, "Oregon");

        callMethod(peachTree);
        callMethod(pearTree);
    }
}