package prototype

fun main() {
    // 準備
    val manager = Manager()
    val uPen = UnderlinePen('~')
    val mBox = MessageBox('*')
    val sBox = MessageBox('/')
    manager.register("strong message", uPen)
    manager.register("warning box", mBox)
    manager.register("slash box", sBox)

    // 生成
    val p1 = manager.create("strong message")
    p1.use("Hello, world.")
    val p2 = manager.create("warning box")
    p2.use("Hello, world.")
    val p3 = manager.create("slash box")
    p3.use("Hello, world.")
}