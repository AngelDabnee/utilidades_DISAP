package AngelDabnee.com

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FourFragment : Fragment() {
     private var countries : List<Country> = emptyList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_four, container, false)

        var recyclerView = view.findViewById<RecyclerView>(R.id.countriesRecycle)
        initData()

        /*Ñinea completa*/
        var layoutManager = LinearLayoutManager(container?.context)
        /*para la cuadricula se necesita
        var gridLayoutManager = GridLayoutManager(container?.context,2)*/

        var adapter =  CountryAdapter(countries)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter

        return view
    }
    fun initData(){
        countries = listOf(
            Country(1,"México","Ciudad de México","https://i.pinimg.com/474x/8c/b7/71/8cb77138ffae06923f2a05f480c7b1bc.jpg","https://i.pinimg.com/474x/8c/b7/71/8cb77138ffae06923f2a05f480c7b1bc.jpg","America del Norte"),
            Country(2,"Estados Unidos","Guanchintong","https://i.pinimg.com/474x/8c/b7/71/8cb77138ffae06923f2a05f480c7b1bc.jpg","https://i.pinimg.com/474x/8c/b7/71/8cb77138ffae06923f2a05f480c7b1bc.jpg","America del Norte")
        )
    }


}