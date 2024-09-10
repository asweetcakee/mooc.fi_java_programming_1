
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mefferio
 */
public class PointsManager {

    private final int MAX_POINT_VALUE = 100;
    private final int MIN_POINT_VALUE = 0;
    private final int MIN_PASSING_VALUE_THRESHOLD = 50;
    private final int E_GRADE_THRESHOLD = 60;
    private final int D_GRADE_THRESHOLD = 70;
    private final int C_GRADE_THRESHOLD = 80;
    private final int B_GRADE_THRESHOLD = 90;
    //private final int A_GRADE_THRESHOLD = 90;

    private ArrayList<Point> points;

    public PointsManager() {
        this.points = new ArrayList<>();
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void addPoint(Point point) {
        if (point.getValue() < MAX_POINT_VALUE && point.getValue() > MIN_POINT_VALUE) {
            this.points.add(point);
        }
    }

    public double averagePoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
        
        int sum = 0;

        for (Point point : this.points) {
            sum += point.getValue();
        }

        return 1.0 * sum / this.points.size();
    }

    public double averagePointsPassed() {
        if (this.points.isEmpty()) {
            return -1;
        }
        
        int sum = 0;

        for (Point point : this.points) {
            if (point.getValue() >= MIN_PASSING_VALUE_THRESHOLD) {
                sum += point.getValue();
            }
        }

        return 1.0 * sum / this.quantityOfPassed();
    }

    public int quantityOfPassed() {
        int counter = 0;
        for (Point point : this.points) {
            if (point.getValue() >= MIN_PASSING_VALUE_THRESHOLD) {
                counter++;
            }
        }
        return counter;
    }

    public double percentagePassed() {
        return 100.0 * this.quantityOfPassed() / this.points.size();
    }

    public int gradesDistribution(Point point) {
        int pointValue = point.getValue();
        
        if (pointValue < MIN_PASSING_VALUE_THRESHOLD) {
            return 0;
        }

        if (pointValue < E_GRADE_THRESHOLD) {
            return 1;
        }

        if (pointValue < D_GRADE_THRESHOLD) {
            return 2;
        }

        if (pointValue < C_GRADE_THRESHOLD) {
            return 3;
        }

        if (pointValue < B_GRADE_THRESHOLD) {
            return 4;
        }

        return 5;
    }
    
    public int gradesQuantity(int grade){
        int counter = 0;
        for (Point point : this.points){
            int compaired = this.gradesDistribution(point);
            if (grade == compaired){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return this.points.toString();
    }

}
