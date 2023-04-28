package sv.edu.udb.proyectomvvm.data

import sv.edu.udb.proyectomvvm.data.network.ApiService
import sv.edu.udb.proyectomvvm.domain.model.PokeItem
import sv.edu.udb.proyectomvvm.domain.model.PokeItemDetails
import sv.edu.udb.proyectomvvm.domain.model.toDomain

class PokeRepository {

    private val api = ApiService()

    suspend fun getAllPokemons(): List<PokeItem> {
        val response = api.getPokemons()
        return response.map { it.toDomain() }
    }

    suspend fun getPokeDetails(id: Int): PokeItemDetails? {
        val response = api.getDetailsPokemon(id)
        return response?.toDomain()
    }
}