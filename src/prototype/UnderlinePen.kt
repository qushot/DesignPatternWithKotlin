package prototype

class UnderlinePen(private val ulChar: Char): Product() {
    override fun use(s: String) {
        val length = s.toByteArray().size
        println("\"$s\"")
        print(" ")
        for (i in 0 until length) {
            print(ulChar)
        }
        println("")
    }

    override fun createClone(): Product {
        return clone() as Product
    }
}