package veil

import munit.FunSuite

class VeilSpec extends FunSuite {

  test("Veil.get") {
    assert(Veil.get("THING_1").contains("abc"))
    assert(Veil.get("THING_2").contains("123"))
    assert(Veil.get("THING_3").contains("1+1=2"))
    assert(Veil.get("THING_4").isEmpty)
    assert(Veil.get("USER").nonEmpty)
  }

}
