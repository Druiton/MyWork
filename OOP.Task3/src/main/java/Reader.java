package main.java;



public class Reader {
    private String name,surname,patronymic, nameofbooks;
    private int numberofticket, falucty, birthdate, numberofbooks;
    private long number;
    private String fullname = name + surname + patronymic;

    public Reader(String name, String surname, String patronymic, String nameofbooks) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.nameofbooks = nameofbooks;
    }

    public Reader(int numberofticket, int falucty, int birthdate, int numberofbooks) {
        this.numberofticket = numberofticket;
        this.falucty = falucty;
        this.birthdate = birthdate;
        this.numberofbooks = numberofbooks;
    }

    public Reader(long number) {
        this.number = number;
    }

    void receiveTakeBook(String name,String surname,String patronymic, String nameofbooks, int numberofbooks){
        System.out.println(name + surname + patronymic + "взял " + numberofbooks + " книгу под названием " + nameofbooks);

    }

    void receiveReturnBook(String name,String surname,String patronymic, String nameofbooks){
        System.out.println(name + surname + patronymic + "вернул " + nameofbooks);

    }
    void receiveCome(String fullname){
        System.out.println("В библиотеку пришел" + fullname);
    }
}





