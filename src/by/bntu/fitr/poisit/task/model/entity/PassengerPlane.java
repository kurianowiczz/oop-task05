package by.bntu.fitr.poisit.task.model.entity;

public class PassengerPlane extends Capacity {
    private String levelOfComfort;

    public PassengerPlane(){
        super();
        this.levelOfComfort = null;
    }

    public PassengerPlane(int countOfCarrying, int countOfPassenger, String levelOfComfort) {
        super(countOfCarrying, countOfPassenger);
        this.levelOfComfort = levelOfComfort;
    }

    public String getLevelOfComfort() {
        return levelOfComfort;
    }

    public void setLevelOfComfort(String levelOfComfort) {
        this.levelOfComfort = levelOfComfort;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "levelOfComfort='" + levelOfComfort + '\'' +
                '}';
    }
}
