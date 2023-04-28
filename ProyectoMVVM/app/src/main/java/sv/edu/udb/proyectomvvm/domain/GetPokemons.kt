package sv.edu.udb.proyectomvvm.domain

import sv.edu.udb.proyectomvvm.data.PokeRepository
import sv.edu.udb.proyectomvvm.domain.model.PokeItem

class GetPokemons {

    private val repository = PokeRepository()

    suspend fun listAll(): List<PokeItem> {
        return repository.getAllPokemons()
    }
}