import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class VehicleTest {

    @Test
    public void CarTestForSolution1(){
        Car car = new Car();
        int num_of_wheels =4;
        int num_of_passenger=4;
        boolean gas=true;
        Assert.assertEquals(num_of_passenger,car.set_num_of_passengers());
        Assert.assertEquals(num_of_wheels,car.set_num_of_wheels());
        Assert.assertEquals(gas,car.has_gas());

    }

    @Test
    public void planeTestForSolution1(){
        Plane plane = new Plane();
        int num_of_wheels =3;
        int num_of_passenger=90;
        boolean gas=false;
        Assert.assertEquals(num_of_passenger,plane.set_num_of_passengers());
        Assert.assertEquals(num_of_wheels,plane.set_num_of_wheels());
        Assert.assertEquals(gas,plane.has_gas());

    }


    @Test
    public void CarTestForSolution2(){
        Vehicle car = new DecoratedVehicle(new NewCar());
        int num_of_wheels =4;
        int num_of_passenger=4;
        boolean gas=true;
        Assert.assertEquals(num_of_passenger,car.set_num_of_passengers());
        Assert.assertEquals(num_of_wheels,car.set_num_of_wheels());
        Assert.assertEquals(gas,car.has_gas());

    }

    @Test
    public void planeTestForSolution2(){
        Vehicle plane = new DecoratedVehicle(new NewPlane());
        int num_of_wheels =3;
        int num_of_passenger=90;
        boolean gas=false;
        Assert.assertEquals(num_of_passenger,plane.set_num_of_passengers());
        Assert.assertEquals(num_of_wheels,plane.set_num_of_wheels());
        Assert.assertEquals(gas,plane.has_gas());

    }




}
