public class Main {
    public static void main(String[] args) {
        //testing Builder design pattern part
        Car carTest = new Car.CarBuilder(1.6,SteeringWheelType.Right, GearBoxType.Automatic, FuelType.Diesel,TyreType.AllSeason).build();
        carTest.printAttributes();
        Car carTest2 = new Car.CarBuilder(1.8,SteeringWheelType.Left, GearBoxType.Manual, FuelType.Diesel,
                TyreType.AllSeason).setAC(true).setAutoPilot(true).build();
        carTest2.printAttributes();

        //testing Adapter design pattern part

        CarAttributesAdapter carTestAdapterSW = new SteeringWheelAdapterImpl(carTest);
        System.out.println("Result should be 'Left' and is... " + carTestAdapterSW.getSteeringWheelType());

        CarAttributesAdapter carTestAdapterTyre = new TyreAdapterImpl(carTest, TyreType.AllSeason);
        System.out.println("Result should be 'All Season' and is... " + carTestAdapterTyre.getTyreType());

        CarAttributesAdapter carTestAdapterFuel = new FuelAdapterImpl(carTest2, FuelType.LPG);
        System.out.println("Result should be 'LPG and is... " + carTestAdapterFuel.getFuelType());


    }
}
