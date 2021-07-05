public class SteeringWheelAdapterImpl implements CarAttributesAdapter {
    private Car car;

    public SteeringWheelAdapterImpl(Car car){
        this.car = car;
    }

    @Override
    public TyreType getTyreType() {
        return car.getTyreType();
    }

    @Override
    public FuelType getFuelType() {
        return car.getFuelType();
    }

    @Override
    public SteeringWheelType getSteeringWheelType() {
        return convertSteeringWheel(car.getSteeringWheel());
    }

    private SteeringWheelType convertSteeringWheel(SteeringWheelType steeringWheel){
        if (steeringWheel == SteeringWheelType.Left)
                return SteeringWheelType.Right;
        else
            return SteeringWheelType.Left;
    }
}
