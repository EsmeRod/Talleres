package sv.edu.udb.proyectomvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sv.edu.udb.proyectomvvm.R
import sv.edu.udb.proyectomvvm.domain.SelectedListener
import sv.edu.udb.proyectomvvm.ui.viewmodel.DetailsViewModel


class MainActivity : AppCompatActivity(), SelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSelected(id: Int) {
        val bundle = Bundle()
        bundle.putInt("id", id)

        val detailFragment = DetailFragment()
        detailFragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, detailFragment)
            .addToBackStack(null) // agragar al stack para volver con back
            .commit()
    }

}