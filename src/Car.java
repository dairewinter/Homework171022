public class Car {
    String brand;
    String model;
    String engineDisplacement;
    String colour;
    int yearProduction;
    String assemblyCountry;

    Car (String brand, String model, String engineDisplacement, String colour, int yearProduction, String assemblyCountry){
        this.brand = brand;
        this.model = model;
        this.engineDisplacement = engineDisplacement;
        this.colour = colour;
        this.yearProduction = yearProduction;
        this.assemblyCountry = assemblyCountry;
    }

    Car (){
        this.brand = "default";
        this.model = "default";
        this.engineDisplacement = "1,4 л";
        this.colour = "белый";
        this.yearProduction = 2000;
        this.assemblyCountry = "default";

    }

    public String getBrandModel(){
        return brand + " " + model;
    }

    public String getEngineDisplacement(){
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

    public String toString() {
        return "Автомобиль: " + getBrandModel()+ "\n" + "Объём двигателя в литрах: " + getEngineDisplacement() + "\n" + "Цвет кузова: " + getColour() + "\n" + "Год выпуска: " + getYearProduction() + "\n" + "Страна сборки: " + getAssemblyCountry();
    }
}

