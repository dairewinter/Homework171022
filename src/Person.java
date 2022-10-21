public class Person {
    private String name;
    private int yearOfBirth;
    private String city;
    String job;

    Person(String name, int age, String city, String job) {
        if (name == null || name.isBlank()){
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (job == null || job.isBlank()){
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    Person(int yearOfBirth) {
        this("Информация не указана", yearOfBirth, "Информация не указана", "Информация не указана");
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isBlank()) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
    }
}
