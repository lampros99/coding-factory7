package gr.aueb.cf.ch17.clone;

public class Trainee {
    private static final String getCity = "";
    private static String name;
    private City city;

    public Trainee(){

    }

    public Trainee(String name, City city){
        this.name = name;
        this.city = city;
    }

    public Trainee(Trainee trainee){
        this.name = Trainee.name;
        this.city = new City(Trainee.getCity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    protected Trainee clone() throws CloneNotSupportedException{
        Trainee trainee = (Trainee) super.clone();
        trainee.setCity(new City(city.getDescription()));
        return trainee;
    }
}
