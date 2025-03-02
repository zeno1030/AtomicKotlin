// StringTemplates/Task3.kt
package stringTemplatesExercise3

fun show(i : Int, s : String, c : Char, d : Double): String =
    "i: $i\ns: \"$s\"\nc: '$c'\nd: $d"

fun main() {
    println(show(1, "abc", 'd', 2.0))
//  show(1, "abc", 'd', 2.0)
}
/* Expected output:
i: 1
s: "abc"
c: 'd'
d: 2.0
*/