package by.bntu.fitr.poisit.task.model.logic;

import by.bntu.fitr.poisit.task.model.entity.Airline;
import by.bntu.fitr.poisit.task.model.entity.Capacity;
import by.bntu.fitr.poisit.task.model.entity.PassengerPlane;

public class LogicTotalPassengerCapacity {
    public static int getTotalPassengerCapacity(Airline airline) {
        int result = 0;
        for(Capacity capacity : airline.getItems()){
            if (capacity instanceof PassengerPlane){
                result += capacity.getCountOfPassenger();
            }
        }
        return result;

    }
}
