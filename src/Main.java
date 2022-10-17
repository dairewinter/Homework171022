public class Main {
    public static void main(String[] args) {
        Person max = new Person("Максим", 35, "Минск", "бренд-менеджер");
        Person anna = new Person("Аня", 29, "Москва", "методист образовательных программ");
        Person katya = new Person("Катя", 28, "Калининград", "продакт-менеджер");
        Person artem = new Person("Артём", 27, "Москва", "директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут " + max.getName() + ". Я из города " + max.getCity() + ". Мне " + max.getAge() + " лет. Моя должность - " + max.getJob());
        System.out.println("Привет! Меня зовут " + anna.getName() + ". Я из города " + anna.getCity() + ". Мне " + anna.getAge() + " лет. Моя должность - " + anna.getJob());
        System.out.println("Привет! Меня зовут " + katya.getName() + ". Я из города " + katya.getCity() + ". Мне " + katya.getAge() + " лет. Моя должность - " + katya.getJob());
        System.out.println("Привет! Меня зовут " + artem.getName() + ". Я из города " + artem.getCity() + ". Мне " + artem.getAge() + " лет. Моя должность - " + artem.getJob());

        Car lada = new Car ("Lada", "Granta", "1,7 литров", "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "3 литра", "черный", 2020, "Германия");
        Car bmw = new Car ("BMW", "Z8","3 литра", "черный", 2021, "Германия");
        Car kia = new Car ("Kia", "Sportage 4-го поколения", "2,4 литра", "красный", 2018, "Южная Корея");
        Car hyundai = new Car ("Hyundai", "Avante", "1,6 литров", "оранжевый", 2016, "Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}