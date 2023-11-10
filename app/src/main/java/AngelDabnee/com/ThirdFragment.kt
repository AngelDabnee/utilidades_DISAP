package AngelDabnee.com

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.bottomsheet.BottomSheetDialog

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val btnToFrist = view.findViewById<Button>(R.id.buttonToFrist)
        val txtname = view.findViewById<EditText>(R.id.txtName)




        btnToFrist.setOnClickListener{

            if(txtname.text.isNotEmpty()){
                val navController : NavController = Navigation.findNavController(view)
                navController.navigate(R.id.action_thirdFragment_to_fristFragment)
            }
            else{
                val bottomSheetDialog = BottomSheetDialog(view.context)
                val parentView: View = layoutInflater.inflate(R.layout.bsd_validation_error,null)
                bottomSheetDialog.setContentView(parentView)
                bottomSheetDialog.show()
            }
        }


        // Inflate the layout for this fragment
        return view
    }
}