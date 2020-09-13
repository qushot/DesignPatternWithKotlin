package factorymethod.idcard

import factorymethod.framework.Factory
import factorymethod.framework.Product

class IDCardFactory: Factory() {
    private val owners = mutableListOf<String>()

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        owners.add((product as IDCard).getOwner())
    }

    fun getOwners(): List<String> {
        return owners
    }
}