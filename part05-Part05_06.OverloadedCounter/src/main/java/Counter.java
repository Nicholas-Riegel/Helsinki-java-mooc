public class Counter {

    private int value;

    // sets the start value of the counter to startValue.
    public Counter(int startValue){
        this.value = startValue;
    }

    // sets the start value of the counter to 0.
    public Counter() {
        this(0);
    }
    
    // returns the current value of the counter
    public int value() {
        return this.value;
    }
    
    // increases the value by 1
    public void increase() {
        this.increase(1);
    }
    
    // decreases the value by 1
    public void decrease() {
        this.decrease(1);
    }

    // increases the value of the counter by the value of increaseBy. If the value of increaseBy is negative, the value of the counter does not change.
    public void increase(int increaseBy) {
        if (increaseBy > 0){
            this.value = this.value + increaseBy;
        }
    }
    
    // decreases the value of the counter by the value of decreaseBy. If the value of decreaseBy is negative, the value of the counter does not change.
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0){
            this.value = this.value - decreaseBy;
        }
    }
}
