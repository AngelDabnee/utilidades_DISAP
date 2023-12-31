package AngelDabnee.com

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val btnToFrist = view.findViewById<Button>(R.id.buttonToFrist)
        val btnToThird = view.findViewById<Button>(R.id.buttonToThird)

        btnToFrist.setOnClickListener{
            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_secondFragment_to_fristFragment)
        }

        btnToThird.setOnClickListener{
            val navController:NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }



        // Inflate the layout for this fragment
        return view
    }
}