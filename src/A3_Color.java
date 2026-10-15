public class A3_Color extends World {

   public int randomRed;
   public int randomBlue;
   public int randomGreen;
   public int randomTrailWidth;


    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        plane.hasTrail = true;
        randomTrailWidth = plane.random(10,200);
        randomRed = plane.random(0,255);
        randomBlue = plane.random(0,255);
        randomGreen = plane.random(0,255);

        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.trailWidth = randomTrailWidth;
        square();
        square();



    } //end of go method

    public void square(){
        randomRed = plane.random(0,255);
        randomBlue = plane.random(0,255);
        randomGreen = plane.random(0,255);
        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.trailWidth = randomTrailWidth;
        plane.move (100);
        plane.turnLeft(90);
        plane.move (100);
        plane.turnLeft(90);
        plane.move (100);
        plane.turnLeft(90);
        plane.move (100);

    }//end of square

} //end of file
