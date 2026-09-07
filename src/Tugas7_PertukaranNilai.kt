fun main() {
    print("Masukkan nilai A: ")
    var a: Int = readln().toInt()

    print("Masukkan nilai B: ")
    var b: Int = readln().toInt()

    println("\n=== SEBELUM DITUKAR ===")
    println("A = $a")
    println("B = $b")

    // Menukar nilai menggunakan variabel sementara
    val sementara = a
    a = b
    b = sementara

    println("\n=== SETELAH DITUKAR ===")
    println("A = $a")
    println("B = $b")
}