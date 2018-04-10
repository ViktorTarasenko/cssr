package strings


final class ConvertedString(string: String) {
  val convertedString = convertString(string)
  override def toString = {
    convertedString.view map  {
      case (key, value) => key + "=" + value.mkString("[",",","]")
    } mkString ("[", ",", "]")

  }
}
object ConvertedString {
  def apply(string: String) = new ConvertedString(string)
}

