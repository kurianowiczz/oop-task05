package by.bntu.fitr.poisit.task.model.entity;

public class CargoPlane extends Capacity{
    private int size;

    public CargoPlane(){
        super();
        this.size = 0;
    }

    public CargoPlane(int countOfCarrying, int countOfPassenger, int size) {
        super(countOfCarrying, countOfPassenger);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "model='" + size + '\'' +
                '}';
    }
}
