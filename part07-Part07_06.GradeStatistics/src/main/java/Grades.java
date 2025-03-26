import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Grades(){
        points = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void addPoint(int point){
        if (point >= 0 && point <= 100){
            points.add(point);
            if (point >= 90){
                grades.add(5);
            } else if (point >= 80){
                grades.add(4);
            } else if (point >= 70){
                grades.add(3);
            } else if (point >= 60){
                grades.add(2);
            } else if (point >= 50){
                grades.add(1);
            } else {
                grades.add(0);
            }
        }
    }

    public int totalPoints(){
        int total = 0;
        for (int num : points){
            total += num;
        }
        return total;
    }

    public double averagePoints(){
        return (double) totalPoints() / points.size();
    }

    public String averageOfPassingPoints(){
        int total = 0;
        int passing = 0;
        for (int num : points){
            if (num >= 50){
                total += num;
                passing++;
            }
        }
        if (passing == 0){
            return "-";
        } 
        return "" + (double) total / passing;
    }

    public double passPercentage(){
        int numPassing = 0;
        for (int num : points){
            if (num >= 50){
                numPassing++;
            }
        }
        return (double) 100 * numPassing / points.size();
    }

    public String printStars(int grade){
        String stars = "";
        for (int num : grades){
            if (num == grade){
                stars += "*";
            }
        }
        return stars;
    }
}
