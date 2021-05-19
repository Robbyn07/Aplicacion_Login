package ec.edu.ups.aplicacion_login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentContainer
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import ec.edu.ups.aplicacion_login.databinding.ActivityMainBinding
import ec.edu.ups.aplicacion_login.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.buttonSignUp.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        binding.buttonLogin.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_initFragment)
        }

        return binding.root
    }

}