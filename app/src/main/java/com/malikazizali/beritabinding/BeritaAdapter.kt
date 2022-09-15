package com.malikazizali.beritabinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.malikazizali.beritabinding.databinding.ItemBeritaBinding

class BeritaAdapter (var listBerita: ArrayList<Berita>): RecyclerView.Adapter<BeritaAdapter.ViewHolder>(){

    class ViewHolder(val binding : ItemBeritaBinding) : RecyclerView.ViewHolder(binding.root){
        fun dataBind(itemData : Berita){
            binding.dataBerita = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ItemBeritaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBind(listBerita[position])
        val title = listBerita[position].title
        val writer = listBerita[position].writer
        val image = listBerita[position].image
        val content = listBerita[position].content
        val date = listBerita[position].date
        holder.binding.cvBerita.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val bun = Bundle()
                bun.putString("title", title)
                bun.putString("writer", writer)
                bun.putInt("image", image)
                bun.putString("content", content)
                bun.putString("date", date)

                Navigation.findNavController(holder.itemView).navigate(R.id.action_beritaFragment_to_detailBeritaFragment, bun)
            }
        })
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }

}