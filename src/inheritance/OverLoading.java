package inheritance;

public class OverLoading {
    public static void main(String[] args) {
        byte Bite = 8;
        ShowCase showCase = new ShowCase();
        showCase.show(2);
        showCase.show("Showcase Demo");
        showCase.show(Bite);
    }
}

class ShowCase {
    public void show(int integer) {
        System.out.println("In int " + integer);
    }

    public void show(String string) {
        System.out.println("In String " + string);
    }

    public void show(byte Byte) {
        System.out.println("In Byte " + Byte);
    }

        public int someMethod() { return 10; }
        public char someMethod(char a) { return 'a'; }


    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public double sum(double a, double b) {
        return a + b;
    }

}