package iterator

class BookShelf(maxsize: Int): Aggregate {
    private val books = Array(maxsize) {Book("")}
    private var last = 0

    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun appendBook(book: Book) {
        this.books[last] = book
        last++
    }

    fun getLength(): Int {
        return last
    }

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}