package com.example.fragments2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments2.databinding.FragmentTiliBinding


class TiliFragment : Fragment() {

    lateinit var binding: FragmentTiliBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_tili, container, false)
        binding = FragmentTiliBinding.bind(view)

        binding.UZBbtn.setOnClickListener {

            val homeFragment = HomeFragment()


            val transient = parentFragmentManager.beginTransaction()
            transient.replace(R.id.container,homeFragment)
            transient.addToBackStack("")
            transient.commit()
        }



        return view
    }


}