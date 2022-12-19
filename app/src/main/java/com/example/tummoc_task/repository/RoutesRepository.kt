package com.example.tummoc_task.repository

import com.example.tummoc_task.model.RouteModel

object RoutesRepository {

    val originLat = "12.960165"
    val originLng = "77.57717"

    val destinationLat = "12.9602"
    val destinationLng = "77.5772"

    val routeModel = RouteModel(
        originLng = originLng,
        originLat = originLat,
        destinationLng = destinationLng,
        destinationLat = destinationLat
    )
}