package org.example.homeworks0510.fahrrad;

public class Factory {
    public static void main(String[] args) {
        Bicycle bicycleMain = new Bicycle("Bicycle", "Bicycle bike",7000.00, "Grey", false);
        Bicycle roadBike = new RoadBike("Road Bike", "Bicycle Road" , 4000.00, "Blue", false, 2);
        Bicycle mountainBike = new MountainBike("Mountain Bike", "Bicycle Mountain",2000.00, "Black and White", true,  "ABC Bike");
        Bicycle kidsBike = new KidsBike("Kids Bike", "Bicycle Kids small", 3500.00, "Yellow and Blue", false, 2);

        bicycleMain.displayBicycleInfo();

        Bicycle[] bicycles = {roadBike, mountainBike,kidsBike};

        for (int i = 0; i < bicycleMain.length; i++) {
            bicycles[i].displayBicycleInfo();
        }
        kidsBike.displayBicycleInfo();
    }
}
