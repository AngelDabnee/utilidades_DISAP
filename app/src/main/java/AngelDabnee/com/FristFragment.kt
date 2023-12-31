package AngelDabnee.com

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs


class FristFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_frist, container, false)

        val btn = view.findViewById<Button>(R.id.buttonToSecond)
        val btnFour = view.findViewById<Button>(R.id.buttonClass)
        val data = view.findViewById<TextView>(R.id.data)
        val recivedData = ""


        if(recivedData.isNotEmpty())
        {
            data.text = recivedData
        }


        btn.setOnClickListener{
            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_fristFragment_to_secondFragment)
        }

        btnFour.setOnClickListener{
            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_fristFragment_to_fourFragment)
        }
        return view

    }
}