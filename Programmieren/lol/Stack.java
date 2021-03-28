package Programmieren.lol;

public class Stack {
    private int top_index;
    private int kapazitaet;
    private int stapel[];

    Stack(int kapazitaet) {
        this.stapel = new int[kapazitaet];
        this.kapazitaet = kapazitaet;
        top_index = -1;
    }

    boolean isFull() {
        return kapazitaet == this.top_index + 1;
    }

    boolean isEmpty() {
        return top_index == -1;
    }

    public void push(int newValue) {
        if (isFull()) {
            System.out.println(
                    newValue + " konnte nicht hinzugefügt werden.\nGrund: Der Stapel ist voll." + this.stapel.length);
        } else {
            this.stapel[++this.top_index] = newValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Nichts ist auf dem Stapel!");
            return -1;
        }
        return this.stapel[this.top_index];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println();
            return -1;
        }
        return this.stapel[this.top_index--];
    }

    public int laenge() {
        return this.top_index + 1;
    }

    public void printStapel() {
        for (int i = this.top_index; i > -1; i--) {
            if (i == this.top_index) {
                System.out.println("Stapel an der Stelle " + i + " = " + this.stapel[i] + " <- top_index");
            } else {
                System.out.println("Stapel an der Stelle " + i + " = " + this.stapel[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack meinStapel = new Stack(5);
        meinStapel.push(1);
        meinStapel.push(2);
        meinStapel.push(3);
        meinStapel.push(0);

        meinStapel.printStapel();

        System.out.println("Oberster Value = " + meinStapel.peek());
    }
}