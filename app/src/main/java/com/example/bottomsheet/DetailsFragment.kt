package com.example.bottomsheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomsheet.databinding.FragmentDetailsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class DetailsFragment : BottomSheetDialogFragment(), View.OnClickListener {

    private lateinit var binding:FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.nameMovieDetails.text = arguments?.getString("nameMovie").toString()
        binding.longMovieDetails.text = arguments?.getString("longMovie").toString()
        binding.actorsMovieDetails.text = arguments?.getString("actorsMovie").toString()

        when(binding.nameMovieDetails.text){
            getString(R.string.badBoys) -> binding.imageMovieDetails.setImageResource(R.drawable.baner)
        }
        binding.closePanel.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.closePanel -> dismiss()
        }
    }
}