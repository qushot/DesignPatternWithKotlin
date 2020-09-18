package prototype

class MessageBox(private val decoChar: Char): Product() {
    override fun use(s: String) {
        val length = s.toByteArray().size
        for (i in 0 until length + 4) {
            print(decoChar)
        }
        println("")
        println("$decoChar $s $decoChar")
        for (i in 0 until length + 4) {
            print(decoChar)
        }
        println("")
    }

    override fun createClone(): Product {
        return clone() as Product
    }
}