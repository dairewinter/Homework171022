public class Person {
    String name;
    int age;
    String city;
    String job;

    Person(String name, int age, String city, String job){
        this.name = name;
        if(age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        this.city = city;
        this.job = job;
    }

    Person(int age){
        this("Информация не указана", age, "Информация не указана", "Информация не указана");
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCity(){
        return city;
    }

    public String getJob(){
        return job;
    }

}
