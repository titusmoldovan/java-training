public class TyreAdapterImpl implements CarAttributesAdapter{
    private Car car;
    private TyreType wantedTyre;

    public TyreAdapterImpl(Car car, TyreType wantedTyre){
        this.car = car;
        this.wantedTyre = wantedTyre;
    }

    @Override
    public TyreType getTyreType() {
        return convertTyre(car.getTyreType(),wantedTyre);
    }

    @Override
    public FuelType getFuelType() {
        return car.getFuelType();
    }

    @Override
    public SteeringWheelType getSteeringWheelType() {
        return car.getSteeringWheel();
    }

    private TyreType convertTyre(TyreType existent, TyreType desired){
        return desired;
    }
}
