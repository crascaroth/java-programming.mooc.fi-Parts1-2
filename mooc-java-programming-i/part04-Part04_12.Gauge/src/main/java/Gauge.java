
public class Gauge {
    private int value;

    public Gauge() {

    }

    public void increase() {
        if (value < 5) {
            this.value++;
        }

    }

    public void decrease() {
        if (value <= 0) {
        } else {
            this.value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }

    }

}
