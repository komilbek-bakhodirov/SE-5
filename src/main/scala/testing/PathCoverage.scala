package testing

object PathCoverage {
  def flip(seed: Int): Boolean = {
    var res = false

    var i: Int = seed
    while (i < Int.MaxValue) {
      res = !res
      i = i + 1
    }

    res
  }
}
