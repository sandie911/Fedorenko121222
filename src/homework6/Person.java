package homework6;

public  class  Person implements Callable
{
    private String name;
    private String surname;
    private String city;
    private String number;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }



    @Override
    public String call() {
        return "Зателефонувати громадянину " + name + " " + surname +  " міста "   + city  +  " можно за номером "  + number;
    }

    @Override
    public String call(Person person) {
        if(this == person)
            return "Неможливо телефонувати самому собі";
            return "громадянин " + name + " " + surname + " телефонує громадянину " + person.getName() + " "+ person.getSurname() + " на номер " + person.getNumber();
    }
    public Person(){

    };
    public Person(String name, String surname,  String city, String number)
    {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.number = number;
    }

}



