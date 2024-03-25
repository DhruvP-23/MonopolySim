package map.locations;
import java.util.HashMap;

public class location {
    public final HashMap<Integer, Integer> houseToRent;
    public final int value;
    public final int mortage;
    public final int unmortage;
    public final int costOfHouse;
    // public final type c;
    public int numHouses;
    public boolean mortaged;
    
    /**
     * 
     * @param v Values of the porperty
     * @param rentMap Cost of Rent
     * @param m Money From Mortage 
     * @param um Cost to unmortage
     * @param COH Cost per House
     * @param c type of property
     */
    public location(int v, HashMap<Integer, Integer> rentMap, int m, int um, int COH){
        this.houseToRent = rentMap;
        this.value = v;
        this.mortage = m;
        this.unmortage = um;
        this.costOfHouse = COH;
        // this.c = c;
    }   



    
}
