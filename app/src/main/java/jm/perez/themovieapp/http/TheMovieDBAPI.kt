package jm.perez.themovieapp.http

import retrofit2.http.GET
import retrofit2.http.Headers

private const val MOVIEDB_ACCESS_TOKEN : String = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1MjUwNTc4N2JkMmI4Yjk3M2Q5N2I4MjNhNDgxMTJlNSIsInN1YiI6IjVlOWE4Y2I1MzEwMzI1MDAyMWM2NjQ3NCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.5gdWY8TQmmGgxB2etPs-OhXJ43mxZ0QQkSfkKNMSVJQ"
private const val API_KEY : String = "52505787bd2b8b973d97b823a48112e5"
private const val BASE_URL : String = "https://api.themoviedb.org"

interface TheMovieDBAPI {

    /* init {
         accessToken = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1MjUwNTc4N2JkMmI4Yjk3M2Q5N2I4MjNhNDgxMTJlNSIsInN1YiI6IjVlOWE4Y2I1MzEwMzI1MDAyMWM2NjQ3NCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.5gdWY8TQmmGgxB2etPs-OhXJ43mxZ0QQkSfkKNMSVJQ";
     }*/


    /*@Headers({
        "Authorization: Bearer $MOVIEDB_ACCESS_TOKEN",
        "Content-Type: application/json;charset=utf-8"
    })*/
    @Headers("Authorization: Bearer ${MOVIEDB_ACCESS_TOKEN}",
              "Content-Type: application/json;charset=utf-8")
    @GET()


}

