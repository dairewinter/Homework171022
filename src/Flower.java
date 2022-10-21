public class Flower {
    String flowerName;
    private String flowerColour;
    private String country;
    private double cost;
    int lifeSpan;

    Flower (String flowerName, String flowerColour, String country, double cost, int lifeSpan){
        this.flowerColour = flowerColour;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    Flower (String flowerColour, String country, double cost, int lifeSpan){
        if (flowerColour != null && !flowerColour.isBlank()) {
            this.flowerColour = flowerColour;
        } else {
            this.flowerColour = "Белый";
        }
        if (country == null){
            country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0){
            cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
        }

        Flower (String flowerColour, String country, double cost){
        this(flowerColour, country, cost, 3);
        }


    public String getFlowerColour() {
        if (flowerColour != null && !flowerColour.isBlank()) {
            return flowerColour;
        } else {
            return flowerColour = "Белый";
        }
    }

    public void setFlowerColour(String flowerColour) {
       if (flowerColour != null && !flowerColour.isEmpty()){
           this.flowerColour = flowerColour;
       } else {
           this.flowerColour = "Белый";
       }

    }

    public String getCountry() {
        if (country != null && !country.isEmpty() && !country.isBlank()){
            return country;
        } else {
           return country = "Россия";
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isBlank()){
        this.country = country;
        } else {
         this.country = "Россия";
        }
    }

    public double getCost() {
        if (cost != 0 && cost > 0) {
            return cost;
        } else {
            return cost = 1;
        }
    }

    public void setCost(float cost) {
        if (cost != 0 && cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }
}
