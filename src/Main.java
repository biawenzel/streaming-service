import br.com.alura.screenlovers.model.Movie;
import br.com.alura.screenlovers.model.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);

        myMovie.showTechnicalInfo();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println("Total number of ratings: " + myMovie.getRatingTotal());
        System.out.println("Average rating: " + myMovie.ratingAverage());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        //lost.showTechnicalInfo();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Time needed to binge-watch this show: " + lost.getDurationInMinutes());
    }
}