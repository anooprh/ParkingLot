import java.util.HashMap;

public class Lot {


    private final int CAPACITY;
    private HashMap < String , Car > parkedList;
    public int count = 0;

    public Lot(int capacity) {
        this.CAPACITY = capacity;
        parkedList = new HashMap < String, Car >();
    }

    private boolean isSpaceAvailable(){
        return parkedList.size() < CAPACITY;
    }

    private String parkTheCar(Car car){
        if(isSpaceAvailable() & !parkedList.containsValue(car))
        {
            String token = getToken();
            parkedList.put(token, car);
            return token;
        }
        return null;
    }

    private String getToken() {
        count ++;
        return "A" + count;
    }

    public boolean isCarParked(Car car) {

        if(parkTheCar(car) != null)    {
            car.token = parkTheCar(car);
            return true;
        }
        return false;
    }
}
