package com.lohika.lerningjava.patterns.Composite.Car;

import com.lohika.lerningjava.patterns.Composite.Car.chassis.Clutch;
import com.lohika.lerningjava.patterns.Composite.Car.chassis.ShockAbsorber;
import com.lohika.lerningjava.patterns.Composite.Car.chassis.Wheel;
import com.lohika.lerningjava.patterns.Composite.Car.interior.AirConditioner;
import com.lohika.lerningjava.patterns.Composite.Car.interior.Glovebox;
import com.lohika.lerningjava.patterns.Composite.Car.interior.Seat;
import com.lohika.lerningjava.patterns.Composite.Car.steering.Accelerator;
import com.lohika.lerningjava.patterns.Composite.Car.steering.GearBox;
import com.lohika.lerningjava.patterns.Composite.Car.steering.SteeringWheel;

public class CarCompositeProgram {
    public static void main(String[] args) {
        CarComposite chassis = new CarComposite();
        chassis.addDetail(new Clutch());
        chassis.addDetail(new ShockAbsorber());
        chassis.addDetail(new Wheel());

        CarComposite interior = new CarComposite();
        interior.addDetail(new AirConditioner());
        interior.addDetail(new Glovebox());
        interior.addDetail(new Seat());

        CarComposite steering = new CarComposite();
        steering.addDetail(new Accelerator());
        steering.addDetail(new GearBox());
        steering.addDetail(new SteeringWheel());

        CarComposite newCar = new CarComposite();
        newCar.addDetail(chassis);
        newCar.addDetail(interior);
        newCar.addDetail(steering);

        newCar.printDetail();
    }
}
