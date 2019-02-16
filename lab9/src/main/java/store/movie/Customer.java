package store.movie;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String id;
    private String name;
    private Double balance;
    private List<Rent> rents;

    public Customer(String id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.rents = new ArrayList<>();
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Double getBalance(){
        return balance;
    }


}
