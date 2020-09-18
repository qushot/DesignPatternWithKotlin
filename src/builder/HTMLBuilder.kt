package builder

import java.io.PrintWriter

class HTMLBuilder: Builder {
    private lateinit var filename: String
    private lateinit var writer: PrintWriter

    override fun makeTitle(title: String) {
        filename = "$title.html"
        writer = PrintWriter(filename)
        writer.println("<html><head><title>$title</title></head><body>")
        writer.println("<h1>$title</h1>")
    }

    override fun makeString(str: String) {
        writer.println("<p>$str</p>")
    }

    override fun makeItems(items: Array<String>) {
        writer.println("<ul>")
        for (item in items) {
            writer.println("<li>$item</li>")
        }
        writer.println("</ul>")
    }

    override fun close() {
        writer.println("</body></html>")
        writer.close()
    }

    fun getResult(): String {
        return filename
    }
}