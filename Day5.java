
public class day5 {

    int time = 40;
    int timeInOven = 18;
    // In minutes
    int layers = 8;

    public int expectedtiimeinoven() {
        return time;
    }

    public int remainingMinutesInOven() {
       return time - timeInOven;  
    }
    public int prepTimeInMinutes() {
        return layers * 2;
    }


}
