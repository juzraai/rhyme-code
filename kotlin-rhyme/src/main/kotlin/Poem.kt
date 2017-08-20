import java.util.*

/**
 * Rhyming Kotlin code written for Facebook post
 * https://www.facebook.com/groups/408156912634809/permalink/1365840896866401
 *
 * @author Zsolt Jurányi (juzraai)
 */

// @formatter:off
// -----------------------------------------------------------------------------

// Okay, let's step in line
@Such fun toCodeInRhyme() {
	days.forEach { println("i'm codin'") }
	if (you.wonder) `this` is Kotlin
	listOf("much", "wow").map(String::length)
	Verse.current.let { it.end() }
}

/* Backticks around */ val `this` /* I have placed */
/* so my */ = Kotlin() /* verse don't need to be braced 😎 */

val days = arrayOf(Date(), Date(), Date())
fun loop() { while (true) /* still might */ break }
val you = Person(wonder = true)
	.apply { color = "dark sea blue" }

@Target(AnnotationTarget.FUNCTION)
annotation class Such /* perfection */

class Verse { companion object { val
current = Verse() } fun end() { print("Farewell!") }
}

data class Person(val wonder: Boolean,
	var color: String = "medium spring green")

fun main(args: Array<String>) {
// Starting point to an app it bring'
}

class/*y*/ Kotlin /* in da' house y'all */

// -----------------------------------------------------------------------------
// @formatter:on