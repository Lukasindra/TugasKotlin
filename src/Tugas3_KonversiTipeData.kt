fun main() {
    print("Masukkan bilangan desimal: ")
    val input: String = readln()

    val nilaiDouble: Double = input.toDouble()
    val nilaiInt: Int = nilaiDouble.toInt()
    val nilaiString: String = nilaiDouble.toString()

    println("\n=== HASIL KONVERSI ===")
    println("Nilai Double : $nilaiDouble")
    println("Nilai Int    : $nilaiInt")
    println("Nilai String : $nilaiString")
}