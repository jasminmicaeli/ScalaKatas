import scala.annotation.tailrec

class GrowingPlant {
  def growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int = {
    @tailrec
    def growingPlantHelper(height : Int, day : Int) : Int = {
      if(height >= desiredHeight) day
      else growingPlantHelper(height + upSpeed - downSpeed, day + 1)
    }
    growingPlantHelper(upSpeed, 1)
  }
}