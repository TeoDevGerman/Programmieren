package Programmieren;

public class Main {
    public static void main(String[] args) {
        Stack meinStapel = new Stack(5);
        meinStapel.push(1);
        meinStapel.push(2);
        meinStapel.push(3);

        meinStapel.printStapel();
    }
}
