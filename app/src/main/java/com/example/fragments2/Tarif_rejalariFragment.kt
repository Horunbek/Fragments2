package com.example.fragments2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments2.databinding.FragmentTarifRejalariBinding


class Tarif_rejalariFragment : Fragment() {
lateinit var binding: FragmentTarifRejalariBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.fragment_tarif_rejalari, container, false)
   binding = FragmentTarifRejalariBinding.bind(view)



        return view
    }


}