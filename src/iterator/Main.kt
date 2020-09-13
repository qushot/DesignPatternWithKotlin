package iterator

fun main() {
    val bookShelf = BookShelf(4)
    bookShelf.appendBook(Book("あああa"))
    bookShelf.appendBook(Book("いいいi"))
    bookShelf.appendBook(Book("うううu"))
    bookShelf.appendBook(Book("えええe"))

    val it = bookShelf.iterator()
    while (it.hasNext()) {
        val book = it.next() as Book
        println(book.getName())
    }
}