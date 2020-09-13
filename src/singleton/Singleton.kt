package singleton

class Singleton private constructor() {
    init {
        println("インスタンスを生成しました。")
    }

    companion object {
        private var s: Singleton = Singleton()
        fun getInstance(): Singleton {
            return s
        }
    }
}