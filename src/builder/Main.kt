package builder

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        usage()
        exitProcess(0)
    }

    when {
        args[0] == "plain" -> {
            val textBuilder = TextBuilder()
            val director = Director(textBuilder)
            director.construct()
            val result = textBuilder.getResult()
            println(result)
        }
        args[0] == "html" -> {
            val htmlBuilder = HTMLBuilder()
            val director = Director(htmlBuilder)
            director.construct()
            val result = htmlBuilder.getResult()
            println(result)
        }
        else -> {
            usage()
            exitProcess(0)
        }
    }
}

fun usage() {
    println("Usage: plain")
    println("Usage: html")
}