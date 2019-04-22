package by.bntu.fitr.poisit.task.model.entity;

public class MilitaryPlane extends Capacity{
    private String specialColoring;

    public MilitaryPlane() {
        super();
        this.specialColoring = null;
    }

    public MilitaryPlane(int countOfCarrying, int countOfPassenger, String specialColoring) {
        super(countOfCarrying, countOfPassenger);
        this.specialColoring = specialColoring;
    }

    public String getColoring() {
        return specialColoring;
    }

    public void setColoring(String coloring) {
        this.specialColoring = coloring;
    }

    @Override
    public String toString() {
        return "MilitaryPlane{" +
                "coloring='" + specialColoring + '\'' +
                '}';
    }

}
