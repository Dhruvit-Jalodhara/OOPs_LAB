package LAB_06;

class WashingMachine {

    void switchOn() {
        System.out.println("Washing Machine Switched On");
    }

    int acceptClothes(int noOfClothes) {
        System.out.println("Number of clothes accepted: " + noOfClothes);
        return noOfClothes;
    }

    void acceptDetergent() {
        System.out.println("Detergent added");
    }

    void switchOff() {
        System.out.println("Washing Machine Switched Off");
    }
}

public class Q03 {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.switchOn();
        wm.acceptClothes(5);
        wm.acceptDetergent();
        wm.switchOff();

    }
}
