package asura.ui.model

import java.util.Random

import asura.ui.util.TypeConverters

case class Position(
                     var x: Int,
                     var y: Int,
                     var width: Int,
                     var height: Int
                   ) {

  def inArea(px: Int, py: Int): Boolean = {
    px >= x && px <= x + width && py >= y && py <= y + height
  }

  def randomPoint(random: Random): (Int, Int) = {
    (x + random.nextInt(width), y + random.nextInt(height))
  }

}

object Position {

  def apply(position: java.util.Map[String, AnyRef]): Position = {
    Position(
      TypeConverters.toInt(position.get("x")),
      TypeConverters.toInt(position.get("y")),
      TypeConverters.toInt(position.get("width")),
      TypeConverters.toInt(position.get("height")),
    )
  }

}
