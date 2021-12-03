package co.com.libisoft.demomvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import co.com.libisoft.demomvvm.model.QuoteModel
import co.com.libisoft.demomvvm.model.QuoteProvider

class QuoteViewModel:ViewModel() {
    val quoteModel= MutableLiveData<QuoteModel>()
    fun getQuote(){
        val datos:QuoteModel=QuoteProvider.ramdom()
        quoteModel.postValue(datos)
    }
}