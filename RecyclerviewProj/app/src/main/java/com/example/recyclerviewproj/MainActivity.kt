package com.example.recyclerviewproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<RecyclerView>(R.id.busesList)

        val list = mutableListOf<BusStation>()
        val listAdapter = BusAdapter(list){
            Toast.makeText(this,"Выбран рейс ${it.departurePoint + it.arrivalPoint}", Toast.LENGTH_SHORT).show()
        }
        listAdapter.buses += BusStation("Санкт-Петербург", "Москва", "18:45", "22:50")
        listAdapter.buses += BusStation("Саратов", "Пенза", "18:45", "21:30")
        listAdapter.buses += BusStation("Пенза", "Евлашево", "12:20", "14:00")
        listAdapter.buses += BusStation("Санкт-Петербург", "Калининград", "15:00", "17:20")
        listAdapter.buses += BusStation("Москва", "Калининград", "15:00", "19:20")
        listAdapter.buses += BusStation("Санкт-Петербург", "Самара", "16:00", "23:20")
        listAdapter.buses += BusStation("Новомосковск", "Москва", "15:00", "17:20")
        listView.adapter = listAdapter
        listView.layoutManager = LinearLayoutManager(this)

        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
            listAdapter.buses += BusStation("Пенза","Махалино", "12:45","14:00")
            listAdapter.notifyItemInserted(listAdapter.itemCount-1)
            listView.smoothScrollToPosition(listAdapter.itemCount-1)

        }
    }
}