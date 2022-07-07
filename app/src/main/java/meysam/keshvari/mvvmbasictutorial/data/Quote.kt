package meysam.keshvari.mvvmbasictutorial.data

class Quote(private val quoteText: String, private val author: String) {
    override fun toString(): String {
        return "$quoteText - $author"
    }
}