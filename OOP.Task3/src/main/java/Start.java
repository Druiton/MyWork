package main.java;

public class Start {
    public static void main(String[] args) {
        Reader reader = new Reader("Максим ","Максимов ","Максимович ","metro");
        reader.receiveCome(" Денис Денисов Денисович");
        reader.receiveTakeBook("Денис ","Денисович ","Денисов ","metro",1);
        reader.receiveReturnBook("Денис ","Денисович ","Денисов ","metro");


    }


}
