package testing

import org.scalacheck.Gen
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class IntAddGroupTest extends AnyFunSuite with ScalaCheckPropertyChecks:

  val intGen = Gen.choose(-500, 500)

  test("+ is associative"):
    forAll(intGen, intGen, intGen) { (a:Int, b:Int, c:Int) =>
        assert((a + b) + c == a + (b + c))
    }

  test("there is a neutral element"):
    forAll(intGen) { (a: Int) =>
      assert(a + 0 == a)
      assert(0 + a == a)
    }

  test("each element has an inverse"):
    forAll(intGen) { (a: Int) =>
      assert(a + (-a) == 0)
    }
