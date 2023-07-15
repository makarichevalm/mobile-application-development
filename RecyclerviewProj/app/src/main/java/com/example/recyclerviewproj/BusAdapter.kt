package com.example.recyclerviewproj

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import  android.view.LayoutInflater

class BusAdapter(val buses: MutableList<BusStation>, private val onClick: (BusStation) ->Unit):
    RecyclerView.Adapter<BusAdapter.ViewHolder>() {
    class ViewHolder(view: View,private val onClick: (BusStation) -> Unit):
        RecyclerView.ViewHolder(view){
        private val departurePointView: TextView = view.findViewById(R.id.departPointView)
        private val arrivalPointView: TextView = view.findViewById(R.id.arrivalPointView)
        private val departureTimeView: TextView = view.findViewById(R.id.departTimeView)
        private val arrivalTimeView: TextView = view.findViewById(R.id.arrivalTimeView)
        private lateinit var bus: BusStation

        init{
            view.setOnClickListener{
                onClick(bus)
            }
        }

       fun bind(bus: BusStation){
           this.bus = bus
           departurePointView.text = bus.departurePoint
           arrivalPointView.text = bus.arrivalPoint
           departureTimeView.text = bus.departureDate
           arrivalTimeView.text = bus.arrivalDate
       }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.bus_item_layout,parent,false)
        return ViewHolder(view,onClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(buses[position])
    }

    override fun getItemCount() = buses.size
}