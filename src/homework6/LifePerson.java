package homework6;

public class LifePerson extends Person
{


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;

    @Override
    public String call() {
        return super.call()  +" Країна " +country;
    }
    public LifePerson(String name, String surname,  String city, String number, String country)
    {
        super( name,  surname,  city, number);

        this.country = country;
    }


    }
