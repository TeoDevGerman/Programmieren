package Programmieren;

public class Stack {
    private int top_index;
    private int kapazitaet;
    private int stapel[];

    Stack(int kapazitaet) {
        this.stapel = new int[kapazitaet];
        this.kapazitaet = kapazitaet;
        top_index = -1;
    }

    boolean isFull(){
        return kapazitaet == stapel.length;
    }

    boolean isEmpty(){
        return top_index == -1;
    }

    public void push(int newValue){
        if(isFull()){
            System.out.println(newValue+" konnte nicht hinzugefügt werden.\nGrund: Der Stapel ist voll.");
        }else{
            this.stapel[++this.top_index] = newValue;
        }
    }

    public int pop() {
        if(isEmpty()){
            System.out.println();
            return -1;
        }
        return this.stapel[this.top_index--];
    }

    public void printStapel(){
        for(int i = 0; i<this.stapel.length; i++){
            System.out.println("Stapel an der Stelle "+ i + " = "+this.stapel[i]);
        }
    }
}