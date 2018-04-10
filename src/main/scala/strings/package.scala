import scala.collection.immutable.TreeMap

/**
  * Created by victor on 11.04.18.
  */
package object strings {
  def convertString(s : String): Map[Char, Seq[String]] = {
    TreeMap(s.split(" ").
      groupBy(word => word.charAt(0)).
      filter(tuple => tuple._2.length > 1).
      mapValues(array => array.sortWith((str1,str2) => if (str1.length == str2.length) str1 <= str2 else str1.length
        > str2.length).toSeq).toArray:_*)
  }
}
