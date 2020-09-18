package prototype

class Manager {
    private val showcase = hashMapOf<String, Any>()

    fun register(name: String, proto: Product) {
        showcase[name] = proto
    }

    fun create(protoName: String): Product {
        val p = showcase[protoName] as Product
        return p.createClone()
    }
}