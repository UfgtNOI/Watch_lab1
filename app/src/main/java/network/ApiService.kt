package network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("?apikey = a22c3789")
    suspend fun searchMovies(
        @Query("s") query: String,
        @Query("y") year: String? = null
    ): Response<SearchResponse>
}

data class SearchResponse(
    val Search: List<SearchItem>?,
    val totalResults: String?
)

data class SearchItem(
    val Title: String,
    val Year: String,
    val imdbID: String,
    val Poster: String
)