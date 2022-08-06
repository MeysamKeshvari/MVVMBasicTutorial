package meysam.keshvari.mvvmbasictutorial.ui.quotes

import androidx.lifecycle.ViewModel
import meysam.keshvari.mvvmbasictutorial.data.Quote
import meysam.keshvari.mvvmbasictutorial.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun deleteAllQuotes() = quoteRepository.deleteAllQuotes()
}