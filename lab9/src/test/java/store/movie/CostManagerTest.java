package store.movie;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class CostManagerTest {

    @Test
    public void calculateCostCustomer() {

        Rent rent = new Rent(5);
        rent.addMovie(new Movie("0", 5, LocalDate.now(), 3.));
        rent.addMovie(new Movie("1", 5, LocalDate.now(), 10.));
        final double aDouble = CostManager.calculateCostCustomer(rent);

        Assert.assertEquals(65.0, aDouble, 0);
    }
}