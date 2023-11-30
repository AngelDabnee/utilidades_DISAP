package AngelDabnee.com

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Button
import android.widget.EditText

class LoginFragment : Fragment() {
    private var users: List<User> = emptyList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        var user = view.findViewById<EditText>(R.id.name)
        var password = view.findViewById<EditText>(R.id.password)

        val btnSumbit = view.findViewById<Button>(R.id.btnSubmit)

        btnSumbit.setOnClickListener {
            valUser()
            if (user.text != null && password.text != null) {
                val email = user.text.toString()
                val password = password.text.toString()

                if (checkUser(email,password,users)) {
                    Toast.makeText(context,"LoginCorrecto",Toast.LENGTH_SHORT).show()
                    val i = Intent(view.context,MainActivity::class.java)
                    startActivity(i)
                    activity?.finish()

                }else{
                    Toast.makeText(context,
                        "Las credenciales no coinciden",
                        Toast.LENGTH_SHORT).show()
                }
            }
        }
        return view
    }
    private fun checkUser(username:String,password:String,users:List<User>):Boolean{
        return users.any{users->username==users.email && password == users.password}
    }
    fun valUser(){
        users= listOf(
            User(1,"angeldabnee@gmail.com","AngelDabnee"),
            User(2,"glenda@gmail.com","glendamorales"),
            User(1,"acuna@gmail.com","luisacuna"),
            User(1,"rubenvega@gmail.com","rubenvega")
        )
    }
}