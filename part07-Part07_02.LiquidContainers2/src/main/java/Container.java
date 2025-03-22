public class Container {

    int filledTo;

    public Container(){
        filledTo = 0;
    }

    // which returns the amount of liquid in a container as an integer.
    public int contains() {
        return filledTo;
    }
    
    // which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added. A container can hold a maximum of 100 units of liquid.
    public void add(int amount) {
        if (amount < 0){
            return;
        }

        if (filledTo + amount > 100){
            filledTo = 100;
        } else {
            filledTo += amount;
        }
    }

    // which removes the amount of liquid given as a parameter from the container. If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
    public void remove(int amount) {
        if (amount < 0){
            return;
        }

        if (amount > filledTo){
            filledTo = 0;
        } else {
            filledTo -= amount;
        }
    }

    // which returns the container as a string formatted "amount of liquid/100, for example "32/100".
    public String toString() {
        return filledTo + "/100";
    }
}
