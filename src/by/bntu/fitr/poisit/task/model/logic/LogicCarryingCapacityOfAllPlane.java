package by.bntu.fitr.poisit.task.model.logic;

import by.bntu.fitr.poisit.task.model.entity.*;

public class LogicCarryingCapacityOfAllPlane {
    public static int getTotalCarryingCapacityOfAllPlane (Airline airline) {
        int result = 0;

        for(Capacity capacity : airline.getItems()){
            if (capacity instanceof Capacity) {
                result += capacity.getCountOfCarrying();
            }
        }
        return result;
    }
}
