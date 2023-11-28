package AngelDabnee.com

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Button
import android.widget.EditText

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        var user = view.findViewById<EditText>(R.id.name)
        var password = view.findViewById<EditText>(R.id.password)

        val btnSumbit = view.findViewById<Button>(R.id.btnSubmit)

        btnSumbit.setOnClickListener{
            if (user.text != null){
                if (password.text != null){
                    Toast.makeText(context, "Validar si existe", Toast.LENGTH_SHORT).show()
                }
            }
        }


        return view
    }

}