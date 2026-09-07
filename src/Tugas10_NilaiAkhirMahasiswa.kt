fun main() {
    print("Masukkan nama mahasiswa: ")
    val nama: String = readln()

    print("Masukkan nilai tugas: ")
    val tugas: Double = readln().toDouble()

    print("Masukkan nilai kuis: ")
    val kuis: Double = readln().toDouble()

    print("Masukkan nilai UTS: ")
    val uts: Double = readln().toDouble()

    print("Masukkan nilai UAS: ")
    val uas: Double = readln().toDouble()

    val nilaiAkhir =
        (tugas * 0.25) +
                (kuis * 0.15) +
                (uts * 0.25) +
                (uas * 0.35)

    println("\n=== NILAI AKHIR ===")
    println("Nama        : $nama")
    println("Nilai tugas : $tugas")
    println("Nilai kuis  : $kuis")
    println("Nilai UTS   : $uts")
    println("Nilai UAS   : $uas")
    println("Nilai akhir : $nilaiAkhir")
}