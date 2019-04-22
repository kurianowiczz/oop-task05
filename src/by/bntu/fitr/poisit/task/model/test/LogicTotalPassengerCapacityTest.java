package by.bntu.fitr.poisit.task.model.test;

import by.bntu.fitr.poisit.task.model.entity.*;
import by.bntu.fitr.poisit.task.model.logic.LogicTotalPassengerCapacity;
import org.junit.Assert;

public class LogicTotalPassengerCapacityTest {

    @org.junit.Test
    public void getTotalPassengerCapacity() {
        int expected = 10;

        int actual = LogicTotalPassengerCapacity.getTotalPassengerCapacity
                (new Airline(new Capacity[]{
                        new MilitaryPlane(100, 0, "green"),
                        new CargoPlane(120, 0, 250),
                        new PassengerPlane(90, 10, "business")}));

        Assert.assertEquals(expected, actual);
    }
}