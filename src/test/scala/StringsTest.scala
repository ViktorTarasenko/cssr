import org.scalatest.{FunSuite, Matchers}
import strings.convertString

class StringsTest extends FunSuite with Matchers{
  test("from test task") {
    var expected = Map('б' -> Seq("биржа", "бокс", "болт"), 'с' -> Seq("сапог", "сарай"))
    expected should be {convertString("сапог сарай арбуз болт бокс биржа")}

  }
  test("second sample to check every conversion") {
    var expected = Map('а' -> Seq("ааы", "апс"), 'р' -> Seq("рннрп", "рер"))
    expected should be {convertString("оала рер рннрп ааы апс")}

  }
}
