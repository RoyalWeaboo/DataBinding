package com.malikazizali.beritabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.malikazizali.beritabinding.databinding.FragmentDetailBeritaBinding

class DetailBeritaFragment : Fragment() {
    lateinit var binding : FragmentDetailBeritaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBeritaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getBeritaData()
    }

    fun getBeritaData(){
        val title = arguments?.getString("title")
        val writer = arguments?.getString("writer")
        val date = arguments?.getString("date")
        val image = arguments?.getInt("image")
        val content = arguments?.getString("content")

        binding.dataBerita = Berita(image!!, title!!, writer!!, date!!, content!! )
    }

}