import java.util.ArrayList;

public class BirdDB {

    private ArrayList<Bird> birdList;

    public BirdDB(){
        birdList = new ArrayList<>();
    }

    public void addBird(Bird bird){
        birdList.add(bird);
    }

    public void listBirds(){
        for (Bird bird : birdList){
            System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObervations() + " observations");
        }
    }

    public boolean checkIfHave(String name){
        boolean have = false;
        for (Bird bird : birdList){
            if (bird.getName().equals(name)){
                have = true;
                break;
            }
        }
        return have;
    }

    public void addObservation(String birdName){
        if (checkIfHave(birdName)){
            for (Bird bird : birdList){
                if (bird.getName().equals(birdName)){
                    bird.addObservation();
                }
            }
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void getOneBird(String birdName){
        for (Bird bird : birdList){
            if (bird.getName().equals(birdName)){
                System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObervations() + " observations");
            }
        }
    }
}
