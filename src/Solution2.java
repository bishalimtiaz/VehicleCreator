class NewCar implements Vehicle{

    String color = "";

    @Override
    public int set_num_of_wheels() {
        return 4;
    }

    @Override
    public int set_num_of_passengers() {
        return 4;
    }

    @Override
    public boolean has_gas() {
        return true;
    }
}


class NewPlane implements Vehicle{

    String color = "";

    @Override
    public int set_num_of_wheels() {
        return 3;
    }

    @Override
    public int set_num_of_passengers() {
        return 90;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}


abstract class VehicleDecorator implements Vehicle {
    protected Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle decoratedVehicle){
        this.decoratedVehicle = decoratedVehicle;
    }



    public int set_num_of_wheels() {
        return decoratedVehicle.set_num_of_wheels();
    }


    public int set_num_of_passengers() {
        return decoratedVehicle.set_num_of_passengers();
    }


    public boolean has_gas() {
        return decoratedVehicle.has_gas();
    }

}

 class DecoratedVehicle extends VehicleDecorator {

    public DecoratedVehicle(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
        setRedBorder();
    }



    public void setRedBorder(){
        System.out.println("Set the Vehicle Color Red");
    }
}