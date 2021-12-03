package co.com.libisoft.demomvvm.model

class QuoteProvider {
    companion object{

        fun ramdom():QuoteModel{
            val index=(0..4).random()
            return quote[index]
        }
        private val quote= listOf<QuoteModel>(
            QuoteModel(quote = "cita 1", author = "autor1"),
            QuoteModel(quote = "cita 2", author = "autor2"),
            QuoteModel(quote = "cita 3", author = "autor3"),
            QuoteModel(quote = "cita 4", author = "autor4")
        )
    }


}