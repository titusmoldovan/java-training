public class Car {
    //required parameters
    private double engine;
    private SteeringWheelType steeringWheel;
    private GearBoxType gearBox;
    private FuelType fuel;
    private TyreType tyre;

    //optional parameters
    private boolean hasAC;
    private boolean hasAutoPilot;
    private boolean hasSeatWarming;

    public double getEngine() {
        return engine;
    }

    public SteeringWheelType getSteeringWheel() {
        return steeringWheel;
    }

    public GearBoxType getGearBox() {
        return gearBox;
    }

    public TyreType getTyreType(){
        return tyre;
    }

    public FuelType getFuelType(){
        return fuel;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public boolean isHasAutoPilot() {
        return hasAutoPilot;
    }

    public boolean isHasSeatWarming() {
        return hasSeatWarming;
    }


    public void printAttributes(){
        System.out.println("Engine size: " + this.engine);
        System.out.println("Steering Wheel location: " + this.steeringWheel);
        System.out.println("Gear box: " + this.gearBox);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Tyres: " + this.tyre);
        System.out.println("Does it have AC: " + this.hasAC);
        System.out.println("Does it have Auto Pilot: " + this.hasAutoPilot);
        System.out.println("Does it have seat warming system: " +  this.hasSeatWarming);

        System.out.println("~~~~~~~~~~~~~~~");


    }
    public Car(CarBuilder builder){
        //required
        this.engine = builder.engine;
        this.gearBox = builder.gearBox;
        this.steeringWheel = builder.steeringWheel;
        this.fuel = builder.fuel;
        this.tyre = builder.tyre;

        //optional;
        this.hasAC = builder.hasAC;
        this.hasAutoPilot = builder.hasAutoPilot;
        this.hasSeatWarming = builder.hasSeatWarming;
    }

    public static class CarBuilder {
        //required parameters
        private double engine; //engine size
        private SteeringWheelType steeringWheel;
        private GearBoxType gearBox;
        private FuelType fuel;
        private TyreType tyre;

        //optional parameters
        private boolean hasAC;
        private boolean hasAutoPilot;
        private boolean hasSeatWarming;

        public CarBuilder(double engine, SteeringWheelType steeringWheel, GearBoxType gearbox, FuelType fuel, TyreType tyre){
            this.engine = engine;
            this.steeringWheel = steeringWheel;
            this.gearBox = gearbox;
            this.fuel = fuel;
            this.tyre = tyre;
        }

        public CarBuilder setAC (boolean hasAc){
            this.hasAC = hasAc;
            return this;
        }

        public CarBuilder setAutoPilot (boolean hasAutoPilot){
            this.hasAutoPilot = hasAutoPilot;
            return this;
        }

        public CarBuilder setSeatWarming (boolean hasSeatWarming){
            this.hasSeatWarming = hasSeatWarming;
            return this;
        }

        public Car build(){
            return new Car(this);

        }
    }
}
