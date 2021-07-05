public class FuelAdapterImpl implements CarAttributesAdapter{
    private Car car;
    private FuelType wantedFuel;

    public FuelAdapterImpl(Car car, FuelType wantedFuel){
        this.car = car;
        this.wantedFuel = wantedFuel;
    }

    @Override
    public TyreType getTyreType() {
        return car.getTyreType();
    }

    @Override
    public FuelType getFuelType() {
        return convertFuel(car.getFuelType(),wantedFuel);
    }

    @Override
    public SteeringWheelType getSteeringWheelType() {
        return car.getSteeringWheel();
    }

    private FuelType convertFuel(FuelType existent, FuelType desired){
        return desired;
    }
}
