package prototype

// Memo: abstract classをinterfaceにすると動かなくなる。よくわからん。
abstract class Product: Cloneable {
    abstract fun use(s: String)
    abstract fun createClone(): Product
}