package store.movie;

import java.util.List;

public class CostManager {

    public static Double calculateCostCustomer(Rent rent) {
        Double temp = 0.;
        final List<Movie> movies = rent.getMovies();

        for (int i = 0; i < movies.size(); i++) {
            if (rent.getDays() >= 10) {
                temp += (movies.get(i).getPrice() / 2);
            } else {
                temp += movies.get(i).getPrice();
            }
        }
        return temp * rent.getDays();
    }


}
