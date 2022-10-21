package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineDisplacement;
    String colour;
    private final int yearProduction;
    private final String assemblyCountry;
    public String transmission;
    private final String bodyType;
    public String registrationNumber;
    private final int numberOfSeats;
    public boolean winterTires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineDisplacement, String colour, Integer yearProduction, String assemblyCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean winterTires, Key key, Insurance insurance) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.engineDisplacement = engineDisplacement;
        if (colour == null) {
            this.colour = "Белый";
        } else {
            this.colour = colour;
        }
        if (yearProduction == null) {
            this.yearProduction = 2000;
        } else {
            this.yearProduction = yearProduction;
        }
        if (assemblyCountry == null) {
            this.assemblyCountry = "default";
        } else {
            this.assemblyCountry = assemblyCountry;
        }

        if (registrationNumber == null) {
            this.registrationNumber = "x000x000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (this.key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (this.insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.numberOfSeats = numberOfSeats;
        this.bodyType = bodyType;

    }

    public Car (String brand, String model,double engineDisplacement,String colour, Integer yearProduction, String assemblyCountry){
        this(brand, model, engineDisplacement,
                colour, yearProduction, assemblyCountry,
                "механическая", "x000xx000", "седан",
                4, false, new Key(), new Insurance());

    }

    public double getEngineDisplacement(){
        return engineDisplacement;
    }
    public String getColour(){
        return colour;
    }

    public int getYearProduction(){
        return yearProduction;
    }

    public String getAssemblyCountry(){
        return assemblyCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "механическая";
        } else {
            this.transmission = transmission;
        }
    }

    public void changeTires(){
    winterTires = !winterTires;
    }

    public boolean numCorrect() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;

}

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key(){
           this (true, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expiry;
        private final double inscost;
        private final String number;

        public Insurance(LocalDate expiry, double inscost, String number) {
            if (expiry == null){
                this.expiry = LocalDate.now().plusYears(2);
            } else {
                this.expiry = expiry;
            }
            this.inscost = inscost;
            if (number == null){
                this.number = "254649268";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
        this(LocalDate.now(), 3950, "127080694");
        }

        public void checkInsuranceNumber(){
            if (number.length() != 9){
                System.out.println("Некорректный номер страховки");
            }
        }

        public void expiryCheking(){
            if (expiry.isBefore(LocalDate.now()) || expiry.isEqual(LocalDate.now())){
                System.out.println("Необходимо срочно оформить страховку!");
            }
        }

        public LocalDate getExpiry() {
            return expiry;
        }

        public double getInscost() {
            return inscost;
        }

        public String getNumber() {
            return number;
        }
    }
}
