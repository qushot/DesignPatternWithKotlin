package templatemethod

class StringDisplay(private val string: String): AbstractDisplay() {
    // デフォルトのCharsets.UTF_8では日本語が3バイト扱いで表示が微妙。。。
    private val width = string.toByteArray().size
    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$string|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for (i in 0 until width) {
            print("-")
        }
        println("+")
    }
}