package inheritance;

class A{
    int x = 100;
}

class B extends A{
    int x = 200;

    public int sum(){
        return x + super.x;
    }
}


public class SuperOperator {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.sum());

        Black black = new Black();
        black.showColourCode();
    }
}


class Colour{
public  void ShowColourCode(){
    System.out.println("Welcome to the colours world");
}
}

class Black extends Colour{

    public void showColourCode() {
        super.ShowColourCode();
        System.out.println("Colour code of black 2345");
    }
}