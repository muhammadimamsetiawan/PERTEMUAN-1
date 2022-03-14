//Tipe data di Kotlin terdiri dari Byte, Short, Int, dan Long untuk bilangan bulat (Number), Double
//dan Float untuk bilangan desimal atau real (Floating-point), Char untuk karakter, Boolean untuk
//kondisional (true/false), String untuk array karakter, Array yang merupakan koleksi data dengan
//tipe data yang homogen, Collection dan Range.

fun main(args: Array<String>) {
    val minByte: Byte = -128
    val maxByte: Byte = 127 // 8bit
    val minShort: Short = -32768
    val maxShort: Short = 32767 // 16bit
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 // 32bit
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807 // 64bit
    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)
}
