package builder

interface Builder {
    abstract fun makeTitle(title: String)
    abstract fun makeString(str: String)
    abstract fun makeItems(items: Array<String>)
    abstract fun close()
}