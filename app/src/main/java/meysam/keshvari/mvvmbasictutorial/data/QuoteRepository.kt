package meysam.keshvari.mvvmbasictutorial.data

class QuoteRepository private constructor(private val fakeQuoteDao: FakeQuoteDao) {

    companion object {
        @Volatile
        private var instance: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao) = instance ?: synchronized(this) {
            instance ?: QuoteRepository(quoteDao).also {
                instance = it
            }
        }
    }

    fun addQuote(quote: Quote) {
        fakeQuoteDao.addQuote(quote)
    }

    fun getQuotes() = fakeQuoteDao.getQuotes()

    fun deleteAllQuotes() = fakeQuoteDao.deleteAllQuotes()
}