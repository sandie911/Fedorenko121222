package homework6;

public class PhoneApp  {

    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith","New York", "2936729462846");
        System.out.println(person1.call());
        Person person2 = new Person("Jackie", "Chan","Shanghai", "123124112");
        System.out.println(person2.call());
        Person person3 = new Person("Sherlock", "Holmes","London", "37742123513");
        System.out.println(person3.call());
        System.out.println(person1.call(person1));
        System.out.println(person1.call(person3));
        System.out.println();

        Person lifeperson = new LifePerson("Jackie", "Chan","Shanghai", "123124112", "China");
        System.out.println(lifeperson.call());
    }
}