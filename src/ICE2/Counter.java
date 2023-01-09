package ICE2;

public class Counter {
    private int value = 0;

//    public Counter(int v){
//        this.value = v;
//    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment(){
        this.value++;
    }

    public void decrement() {
        this.value--;
    }

    public void reset() {
        this.setValue(0);
    }

}
