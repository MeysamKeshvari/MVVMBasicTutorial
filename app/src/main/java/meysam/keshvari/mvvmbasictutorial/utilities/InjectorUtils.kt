package meysam.keshvari.mvvmbasictutorial.utilities

import meysam.keshvari.mvvmbasictutorial.data.FakeDatabase
import meysam.keshvari.mvvmbasictutorial.data.QuoteRepository
import meysam.keshvari.mvvmbasictutorial.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory():QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository);
    }
}