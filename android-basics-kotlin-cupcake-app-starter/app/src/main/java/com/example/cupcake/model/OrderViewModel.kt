package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*
import java.util.Calendar

class OrderViewModel : ViewModel() {

    private val _quantity = MutableLiveData(0)
    val quantity: LiveData<Int> = _quantity

    private val _flavor = MutableLiveData("")
    val flavor: LiveData<String> = _flavor

    private val _date = MutableLiveData("")
    val date: LiveData<String> = _date

    private val _price = MutableLiveData(0.0)
    val price: LiveData<Double> = _price
    val dateOptions = getPickupOptions()

    //setters for above properties
    fun setQuantity(numbersCupcake :Int) {
        _quantity.value=numbersCupcake

    }
    fun hasNoFlavorSet(): Boolean {
        return _flavor.value.isNullOrEmpty()
    }
    fun setFlavor(desiredFlavor:String) {
        _flavor.value=desiredFlavor
    }
    fun setDate(desiredDate:String){
        _date.value=desiredDate
    }

    // function to return the date corresponding to local date on user's device.
    private fun getPickupOptions(): List<String> {
        val options = mutableListOf<String>()
        val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
        val calender = Calendar.getInstance()
        repeat(4){
            options.add(formatter.format(calender.time))
            calender.add(Calendar.DATE, 1)

        }

        return options
    }



}