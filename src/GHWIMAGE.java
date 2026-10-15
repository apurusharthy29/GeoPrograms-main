public class GHWIMAGE extends World{

    public int randomColour;
    public int randNum;

    public void go() {
   plane.teleport(0,0);
   plane.pausetime = 0;
    plane.trailWidth = 800;
    plane.hasTrail = true;
    plane.setTrailColor (0,0,0);
    plane.move (1000);

        for (int x = 0; x <20; x = x+1) {
            tinyStar();
        }//end of loop to make 15 tiny stars everywhere

        randNum = plane.random(0, 2);
        if (randNum == 0) {
        for (int x = 0; x <15; x = x+1) {
            whiteStar();
        }//end of loop, makes 15 white stars all in different places
        }//end of if statement, if 0, then 15 white stars

        if (randNum == 1) {
            for (int x = 0; x < 15; x = x + 1) {
                greyStar();
            }//end of loop, makes 15 grey stars in dif locations
        }//end of if statement, if 1, then 15 grey stars
        plane.teleport (0,400);
        plane.setTrailColor(255, 150, 0);
        plane.fillCircle(380); //Supposed to be the sun
        plane.setTrailColor(255,170,40);
        plane.trailWidth = 20;
        plane.circle(390);
        plane.setTrailColor(255,190,80);
        plane.circle(400);
        plane.setTrailColor(255,210,120);
        plane.circle(410);
        plane.setTrailColor(255,230,160);
        plane.circle(420);
        plane.setTrailColor(255,255,200);
        plane.circle(430);
        plane.setTrailColor(255,255,240);
        plane.circle(440); //add layers to the sun to make it seem bright

            }//end of go

 public void whiteStar () {
     int randX = plane.random(300,900);
     int randY = plane.random(0,700);
     plane.teleport(randX, randY);
     plane.setTrailColor(255, 255, 255);
     plane.setAngle(-60);
    plane.trailWidth = 2;
     plane.move(50);
     plane.turnLeft(-120);
     plane.move (50);
     plane.turnLeft (-150);
     plane.move (60);
     plane.turnLeft (-150);
     plane.move (50);
     plane.turnLeft(-150);
     plane.move(60);
 }//end of star method, Method makes stars in random locations


    public void greyStar () {
        int randX = plane.random(300,1000);
        int randY = plane.random(0,800);
        plane.teleport(randX, randY);
        plane.setTrailColor(100, 100, 100);
        plane.setAngle(-60);
        plane.trailWidth = 2;
        plane.move(50);
        plane.turnLeft(-120);
        plane.move (50);
        plane.turnLeft (-150);
        plane.move (60);
        plane.turnLeft (-150);
        plane.move (50);
        plane.turnLeft(-150);
        plane.move(60);
    }//end of greyStar method, makes 15 grey stars in dif locations

    public void tinyStar(){
        int randX = plane.random(335,900);
        int randY = plane.random(0,700);
        plane.teleport(randX, randY);
        randomColour = plane.random(150,255);
        plane.setTrailColor (randomColour,randomColour,randomColour);
        plane.fillCircle(2);
    }//End of tinyStar, makes little stars everywhere that look like they are further

}//End of file
