package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMovie.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val fragmentDetails = DetailsFragment()

        var parameters = Bundle()

        parameters.putString("nameMovie", binding.nameMovie.text.toString())
        parameters.putString("longMovie", binding.longMovie.text.toString())
        parameters.putString("actorsMovie", binding.actorsMovie.text.toString())

        fragmentDetails.arguments = parameters

        fragmentDetails.show(supportFragmentManager, "details")
    }
}