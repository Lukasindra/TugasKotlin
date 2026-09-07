fun main() {
    print("Masukkan nama pegawai: ")
    val namaPegawai: String = readln()

    print("Masukkan gaji pokok: ")
    val gajiPokok: Double = readln().toDouble()

    print("Masukkan tunjangan: ")
    val tunjangan: Double = readln().toDouble()

    print("Masukkan uang lembur: ")
    val uangLembur: Double = readln().toDouble()

    print("Masukkan potongan: ")
    val potongan: Double = readln().toDouble()

    val gajiKotor = gajiPokok + tunjangan + uangLembur
    val gajiBersih = gajiKotor - potongan

    println("\n=== SLIP GAJI ===")
    println("Nama pegawai : $namaPegawai")
    println("Gaji pokok   : Rp $gajiPokok")
    println("Tunjangan    : Rp $tunjangan")
    println("Uang lembur  : Rp $uangLembur")
    println("Gaji kotor   : Rp $gajiKotor")
    println("Potongan     : Rp $potongan")
    println("Gaji bersih  : Rp $gajiBersih")
}