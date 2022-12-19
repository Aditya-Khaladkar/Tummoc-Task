package com.example.tummoc_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tummoc_task.adapter.RoutesAdapter
import com.example.tummoc_task.databinding.ActivityMainBinding
import com.example.tummoc_task.model.RouteModel
import com.example.tummoc_task.repository.RoutesRepository

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = _binding.root
        setContentView(view)

        val list = ArrayList<RouteModel>()

        _binding.recyclerView.layoutManager = LinearLayoutManager(this)
        _binding.recyclerView.setHasFixedSize(true)

        list.add(RoutesRepository.routeModel)

        val adapter = RoutesAdapter(list)

        _binding.recyclerView.adapter = adapter
    }
}