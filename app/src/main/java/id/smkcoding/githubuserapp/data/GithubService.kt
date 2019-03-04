package id.smkcoding.githubuserapp.data

import id.smkcoding.githubuserapp.GithubUser
import retrofit2.Call
import retrofit2.http.GET

interface GithubService {

    @GET("users")
    fun getUsers(): Call<List<GithubUser>>

}