package sv.edu.udb.proyectomvvm.data.network

import sv.edu.udb.proyectomvvm.data.model.PokeModelDetails
import sv.edu.udb.proyectomvvm.data.model.ResultApi
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {

    @GET(value = "pokemon?limit=1154")
    suspend fun getListPokemon(): Response<ResultApi>

    @GET(value = "pokemon/{id}")
    suspend fun getDetailsPokemon(@Path("id") id: Int): Response<PokeModelDetails>
}

