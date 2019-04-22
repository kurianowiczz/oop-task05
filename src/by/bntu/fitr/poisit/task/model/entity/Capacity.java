package by.bntu.fitr.poisit.task.model.entity;

import java.util.Objects;

public abstract class Capacity {
    private int countOfCarrying;
    private int countOfPassenger;

    public Capacity() {
        this.countOfCarrying = 0;
        this.countOfPassenger = 0;
    }

    public Capacity(int countOfCarrying, int countOfPassenger) {
        this.countOfCarrying = countOfCarrying;
        this.countOfPassenger = countOfPassenger;
    }

    public int getCountOfCarrying() {
        return countOfCarrying;
    }

    public void setCountOfCarrying(int countOfCarrying) {
        this.countOfCarrying = countOfCarrying;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    public void setCountOfPassenger(int countOfPassenger) {
        this.countOfPassenger = countOfPassenger;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "countOfCarrying=" + countOfCarrying +
                ", countOfPassenger=" + countOfPassenger +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capacity capacity = (Capacity) o;
        return countOfCarrying == capacity.countOfCarrying &&
                countOfPassenger == capacity.countOfPassenger;
    }

}
