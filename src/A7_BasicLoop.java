 public class A7_BasicLoop extends World {

     public int randomRed;
     public int randomBlue;
     public int randomGreen;


     public void go() {
         plane.hasTrail = true;
         plane.pausetime = 0;
         randomRed = plane.random(0, 255);
         randomBlue = plane.random(0, 255);
         randomGreen = plane.random(0, 255);
         plane.trailWidth = 3;

         plane.setTrailColor(randomRed, randomGreen, randomBlue);
        for(int y = 0; y<6; y = y+1) { //controls up and down
            for (int x = 0; x < 7; x = x + 1) { //controls left and right
                // make a row of squares using teleport
//             System.out.println("x: " + x);
                plane.teleport(140 * x, 100*y);
                plane.setTrailColor(0, 0, 10 + 20 * y + 20 * x);
                secondSquare();

            }
//            for (int x = 0; x < 7; x = x + 1) {
//                plane.teleport(140 * x, 300);
//                plane.setTrailColor(0, 10 + 20 * x, 0);
////             tree();
//                secondSquare();
//            }
//            for (int x = 0; x < 7; x = x + 1) {
//                plane.teleport(140 * x, 80);
//                plane.setTrailColor(10 + 20 * x, 0, 0);
////             tree();
//                secondSquare();
            } //end of inner loop
        //end of outer loop
     }

         public void house () {
             plane.hasTrail = true;
             plane.setAngle(0);
             square();
             plane.setAngle(0);
             equitriangle();
             plane.hasTrail = false;
             plane.setAngle(270);
             plane.move(200);
             plane.hasTrail = true;
             plane.pausetime = 0;
         }

         public void equitriangle () {
             plane.move(222);
             plane.turnLeft(120);
             plane.move(222);
             plane.turnLeft(120);
             plane.move(222);
             plane.turnLeft(120);
         }

         public void square () {
             plane.setAngle(90);
             plane.hasTrail = true;
             plane.trailWidth = 10;
             plane.move(222);
             plane.turnLeft(90);
             plane.move(222);
             plane.turnLeft(90);
             plane.move(222);
             plane.turnLeft(90);
             plane.move(222);
         }

         public void tree () {
             randomRed = plane.random(0, 255);
             randomBlue = plane.random(0, 255);
             randomGreen = plane.random(0, 255);
             plane.setTrailColor(randomRed, randomGreen, randomBlue);
             plane.setAngle(-90);
             plane.hasTrail = true;
             plane.trailWidth = 100;
             plane.move(100);
             plane.trailWidth = 10;
             plane.fillCircle(130);


         }

         public void secondSquare () {
             plane.setAngle(90);
             plane.hasTrail = true;
             plane.trailWidth = 10;
             for (int a = 0; a < 4; a = a + 1) {
                 plane.move(100);
                 plane.turnLeft(90);

             }

         }
 }
