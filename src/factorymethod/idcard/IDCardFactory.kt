package factorymethod.idcard

import factorymethod.framework.Factory
import factorymethod.framework.Product

class IDCardFactory: Factory() {
    private val _owners = mutableListOf<String>()
    val owners: List<String> = _owners

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        _owners.add((product as IDCard).owner)
    }
}