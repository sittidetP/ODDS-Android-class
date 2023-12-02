sealed class BackgroundColor {
    class Red : BackgroundColor() {
        fun printR() = ""
    }
    class Green : BackgroundColor() {
        fun printG() = ""
    }
    class Custom(val hex: Int) : BackgroundColor() // receive when run-time (unknown parameter)
    {
        fun printC() = ""
    }
}

fun aaaa(bgc: BackgroundColor) {
    when (bgc) {
        is BackgroundColor.Red -> {
            bgc.printR()
        }
        is BackgroundColor.Green -> {
            bgc.printG()
        }
        is BackgroundColor.Custom -> {
            bgc.printC()
        }
    }
}