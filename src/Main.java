import transport.Car;

public class Main {
    public static void main(String[] args) {
        Person max = new Person("Максим", 35, "Минск", "бренд-менеджер");
        Person anna = new Person("Аня", 29, "Москва", "методист образовательных программ");
        Person katya = new Person("Катя", 28, "Калининград", "продакт-менеджер");
        Person artem = new Person("Артём", 27, "Москва", "директор по развитию бизнеса");
        Person vlad = new Person("Владимир", 21, "Казань", null);

        printInfo(max);
        printInfo(anna);
        printInfo(katya);
        printInfo(artem);
        printInfo(vlad);

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4,"красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6,"оранжевый", 2016, "Южная Корея");

        carInfo(lada);
        carInfo(audi);
        carInfo(bmw);
        carInfo(kia);
        carInfo(hyundai);

        Flower rose = new Flower(null, "Голландия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15, 5);
        Flower peony = new Flower(null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower(null, "Турция", 19.5, 10);

        flowersPrintInfo(rose);
        flowersPrintInfo(chrysanthemum);
        flowersPrintInfo(peony);
        flowersPrintInfo(gypsophila);
        printCostofBouquet(rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, gypsophila);
    }

    private static void printInfo(Person person) {
        System.out.println("Привет! Меня зовут " + person.getName() + ". Я из города " + person.getCity() + ". Мне " + person.getYearOfBirth() + " лет. Моя должность - " + person.job);
    }



        private static void flowersPrintInfo(Flower flower){
            System.out.println("Цвет: " + flower.getFlowerColour() + "\n" +
                    "Страна: " + flower.getCountry() + "\n" +
                    "Стоимость: " + flower.getCost() + "\n" +
                    "Срок стояния: " + flower.lifeSpan);
        }


    private static void printCostofBouquet(Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            flowersPrintInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minLifeSpan);
    }

    private static void carInfo(Car car){
        System.out.println(car.getBrand() + " " + car.getModel() + " " +
                ", год выпуска: " + car.getYearProduction() + " " +
                ", страна сборки: " + car.getAssemblyCountry() + " " +
                ", цвет: " + car.getColour() + " " +
                ", тип кузова:" + car.getBodyType() + " " +
                ", объём двигателя: " + car.getEngineDisplacement() + " " +
                ", количество мест: " + car.getNumberOfSeats() + " " +
                ", регистрационный номер: " + car.registrationNumber + " " +
                ", " + (car.getKey().isKeylessAccess() ? "безключевой доступ" : "ключевой доступ") +
                ", " + (car.getKey().isRemoteEngineStart() ? "удаленный доступ к двигателю" : "обычный доступ к двигателю")+
                ", номер страховки: " + car.getInsurance().getNumber() + ", стоимость страховки: " + car.getInsurance().getInscost() +
                ", срок действия страховки: " + car.getInsurance().getExpiry());
    }
    }