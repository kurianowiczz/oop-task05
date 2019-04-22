package by.bntu.fitr.poisit.task.model.entity;

import java.util.Arrays;

public class Airline {
    private Capacity[] items;

    public Airline(Capacity[] items) {
        this.items = items;
    }

    public Capacity[] getItems(){

        return items;
    }

    public void setItems(Capacity[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}

