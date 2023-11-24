package testing

object EdgeCoverage {
  def magic(n: Int, d: Double): Long = {
    var res = 0.0
    var seed = d

    if (n >= 12 && d <= 60.0) {
      var i = n
      while (i != 0) {
        seed = seed / 2
        res = res + seed
        i = i - 1
      }
    } else if(d <= 2*n) {
      res = d*n
    } else {
      res = -1
    }

    res.round
  }
}