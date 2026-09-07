fun main() {
    print("Masukkan nama barang: ")
    val namaBarang: String = readln()

    print("Masukkan harga barang: ")
    val hargaBarang: Double = readln().toDouble()

    print("Masukkan jumlah barang: ")
    val jumlahBarang: Int = readln().toInt()

    print("Masukkan diskon (%): ")
    val diskon: Double = readln().toDouble()

    val subtotal = hargaBarang * jumlahBarang
    val potongan = subtotal * diskon / 100
    val totalBayar = subtotal - potongan

    println("\n=== STRUK BELANJA ===")
    println("Nama barang : $namaBarang")
    println("Harga       : Rp $hargaBarang")
    println("Jumlah      : $jumlahBarang")
    println("Subtotal    : Rp $subtotal")
    println("Diskon      : $diskon%")
    println("Potongan    : Rp $potongan")
    println("Total bayar : Rp $totalBayar")
}