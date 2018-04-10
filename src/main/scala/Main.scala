import strings.{ConvertedString, convertString}


object Main {
  def main(args : Array[String]): Unit = {
   println(ConvertedString(args.mkString(" ")).toString)
  }

}
