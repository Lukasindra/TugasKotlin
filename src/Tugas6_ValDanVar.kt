fun main() {
    // val digunakan untuk data yang tidak berubah
    val nama: String = "Lukas Indra"
    val npm: String = "245314016"

    // var digunakan untuk data yang dapat berubah
    var semester: Int = 4
    var ipk: Double = 3.50

    println("=== DATA SEBELUM DIPERBARUI ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")

    // Memperbarui nilai variabel var
    semester = 5
    ipk = 3.60

    println("\n=== DATA SETELAH DIPERBARUI ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")
}