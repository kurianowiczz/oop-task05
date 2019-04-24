import by.bntu.fitr.poisit.task.model.entity.*;
import by.bntu.fitr.poisit.task.model.logic.LogicCarryingCapacityOfAllPlane;
import org.junit.Assert;
import org.junit.Test;

public class LogicCarryingCapacityOfAllPlaneTest {

    @Test
    public void getTotalCarryingCapacityOfAllPlane() {
        int expected = 310;

        int actual = LogicCarryingCapacityOfAllPlane.getTotalCarryingCapacityOfAllPlane
                (new Airline(new Capacity[]{
                        new MilitaryPlane(100, 0, "green"),
                        new CargoPlane(120, 0, 250),
                        new PassengerPlane(90, 10, "business")}));

        Assert.assertEquals(expected, actual);

    }
}