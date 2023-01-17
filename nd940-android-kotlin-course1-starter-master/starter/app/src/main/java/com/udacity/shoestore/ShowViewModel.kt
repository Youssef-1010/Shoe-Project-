package com.udacity.shoestore

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import timber.log.Timber

class ShowViewModel : ViewModel() {


    val shoeName = MutableLiveData<String>()
    val shoeSize = MutableLiveData<String>()
    val shoeCompany = MutableLiveData<String>()
    val shoeDescription = MutableLiveData<String>()



    private val  _List = MutableLiveData<MutableList<Shoe>>()
    val list: LiveData<MutableList<Shoe>>
        get() = _List


    private var _shoesList = MutableLiveData<MutableList<Shoe>>()
    val shoesList: LiveData<MutableList<Shoe>>
    get() = _shoesList


    fun adddd(shoe: Shoe) {
        _shoesList.value?.add(shoe)
        _List.value?.add(buildShoe())
    }

    fun addShoe(name: String, size: String, company: String, description: String) {
        _List.value?.add(Shoe(name, size, company, description))
    }


    fun buildShoe() : Shoe {
        return Shoe(

            shoeName.value ?: " ",
            shoeSize.value ?: " ",
            shoeCompany.value ?: " ",
            shoeDescription.value ?: " ",
            arrayListOf("")
        )
    }



   // private val _shoesList = MutableLiveData<MutableList<Shoe>>()
    //val shoesList: LiveData<MutableList<Shoe>>
    //get() = _shoesList


   /*  var ShoeName = MutableLiveData<String>()
    fun addddd( name :String)
    {
        shoeName.value?.add(name)
    }

    init {
        ShoeName.value = "be"
    }


    fun add( name :String)
    {
       ShoeName.value =name
    }

      private fun shoeSizeAsDouble() : Double {

        return shoeSize.value?.toDouble()!!
    }

*/
}


