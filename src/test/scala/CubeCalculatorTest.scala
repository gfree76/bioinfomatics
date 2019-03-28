import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite{
  test("CubeCalculator.Cube"){
    assert(CubeCalculator.cube(3) === 27)
    assert(CubeCalculator.cube(0) === 0)
  }
  test("testNegativeNumbers"){
    assert(CubeCalculator.cube(-4) === -64)
  }
}
