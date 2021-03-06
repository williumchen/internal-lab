package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */
object LoopUntil extends App {

  // define the new control-flow structure here
  def loop_until(condition: =>Boolean)(function: =>Unit): Unit = {
    if (!condition) {
      function
      loop_until(condition)(function)
    }
  }
  
  var i = 0
  loop_until (i > 9) {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  }

}

