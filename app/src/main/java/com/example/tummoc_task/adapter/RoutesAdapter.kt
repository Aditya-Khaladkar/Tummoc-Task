package com.example.tummoc_task.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tummoc_task.R
import com.example.tummoc_task.model.RouteModel
import com.example.tummoc_task.repository.RoutesRepository

class RoutesAdapter(private val list: List<RouteModel>) : RecyclerView.Adapter<RoutesAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txt_oriLat = itemView.findViewById<TextView>(R.id.txt_oriLat)
        val txt_oriLng = itemView.findViewById<TextView>(R.id.txt_oriLng)
        val txt_desLat = itemView.findViewById<TextView>(R.id.txt_desLat)
        val txt_desLng = itemView.findViewById<TextView>(R.id.txt_desLng)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.routes_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = list[position]
        holder.txt_oriLat.text = item.originLat
        holder.txt_oriLng.text = item.originLng
        holder.txt_desLat.text = item.destinationLat
        holder.txt_desLng.text = item.destinationLng
    }

    override fun getItemCount(): Int {
        return list.size
    }
}