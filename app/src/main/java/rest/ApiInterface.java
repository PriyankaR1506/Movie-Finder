package rest;

import model.MovieResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Call;


/**
 * Created by remotetiger on 8/19/16.
 */
public class ApiInterface {

    @GET("movie/top_rated")
    public Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey) {
        return null;
    }

    @GET("movie/{id}")
    Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey) {
        return null;
    }

}
