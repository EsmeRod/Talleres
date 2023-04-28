package sv.edu.udb.proyectomvvm.domain

import sv.edu.udb.proyectomvvm.data.PokeRepository
import sv.edu.udb.proyectomvvm.domain.model.PokeItemDetails

class GetDetails {

    private val repository = PokeRepository()

    suspend fun fromPokemon(id: Int): PokeItemDetails? {
        return repository.getPokeDetails(id)
    }
}