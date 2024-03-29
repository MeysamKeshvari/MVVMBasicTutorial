package meysam.keshvari.mvvmbasictutorial.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>() //private val quotes: MutableLiveData<List<Quote>> = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList
    }

    fun getQuotes() = quotes as LiveData<List<Quote>>

    /*fun getQuotes(): LiveData<List<Quote>> {
        quotes.value = quoteList
        return quotes
    }*/

    fun deleteAllQuotes(): LiveData<List<Quote>> {
        quoteList.clear()
        quotes.value = quoteList
        return quotes
    }
}