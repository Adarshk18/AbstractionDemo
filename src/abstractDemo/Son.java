package abstractDemo;

public class Son extends Parent{
    public Son(int age) {
       super(age);
    }

    @Override
    void career() {
        System.out.println("I m going to be a coder" );
    }

    @Override
    void partner() {
        System.out.println("I love perry" );
    }
}
