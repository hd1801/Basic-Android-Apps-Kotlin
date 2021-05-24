package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {

    private val _quantity = MutableLiveData(0)
    val quantity: LiveData<Int> = _quantity

    private val _flavor = MutableLiveData("")
    val flavor: LiveData<String> = _flavor

    private val _date = MutableLiveData("")
    val date: LiveData<String> = _date

    private val _price = MutableLiveData(0.0)
    val price: LiveData<Double> = _price

    //setters for above properties
    fun setQuantity(numbersCupcake :Int) {
        _quantity.value=numbersCupcake

    }
    fun setFlavor(desiredFlavor:String) {
        _flavor.value=desiredFlavor
    }
    fun setDate(desiredDate:String){
        _date.value=desiredDate
    }



}