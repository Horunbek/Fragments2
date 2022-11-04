package com.example.fragments2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments2.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        binding = FragmentHomeBinding.bind(view)

        binding.LL1.setOnClickListener {
            val tarifRejalarifragment = Tarif_rejalariFragment()
            val transition = parentFragmentManager.beginTransaction()
            transition.replace(R.id.container, tarifRejalarifragment)
            transition.commit()
        }



        return view
    }

}