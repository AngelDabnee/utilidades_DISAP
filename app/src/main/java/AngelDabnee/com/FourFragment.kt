package AngelDabnee.com

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class FourFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_four, container, false)

        val btn = view.findViewById<Button>(R.id.fourtoFrist)


        btn.setOnClickListener{
            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_fourFragment_to_fristFragment)
        }
        return view
    }
    public fun initData(){

    }


}