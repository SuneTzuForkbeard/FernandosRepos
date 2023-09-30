@main def generate() : Unit =
  allCiphers.foreach {
    (offset, charMap) => println(s"$offset: ${secretWord.map(ch => charMap(ch)).mkString}")
  }


val secretWord = "nothing really"

val characters = 'a' to 'z'

val allCiphers = for offset <- (1 until characters.length) yield
  offset -> (characters.zipWithIndex.map((ch, indx) => characters((indx + offset) % characters.length ) -> ch).toMap)