public class Main {
    public static void main(String[] args) {
        Stack meinStapel = new Stack(5);
        
        meinStapel.push(5);
        meinStapel.push(10);
        meinStapel.push(15);
        meinStapel.push(25);
        meinStapel.push(35);

        meinStapel.printStapel();
    }
}