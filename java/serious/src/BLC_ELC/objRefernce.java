package BLC_ELC;

public class objRefernce {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static objRefernce data(String name1, int id1) {
        objRefernce obj = new objRefernce();
        obj.name = name1;
        obj.id = id1;
        return obj;
    }
}
