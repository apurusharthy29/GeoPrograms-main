public class A5_Square extends World {

    public int randomSize;
    public int randomLocation;

    public void go() {
        plane.trailWidth = 5;
        plane.pausetime = 0;
        plane.setTrailColor(100, 10, 200);

        house();
        plane.teleport(100,100);
        house();
        plane.teleport(865,150);


    }

    //parameter is special variable that is made in the parenthesis of a method
    //it can only be used in the method
    //integers, boolean
    public void square(int size) {
        plane.setAngle(90);
        plane.hasTrail = true;

        randomSize = plane.random(10,300);
        plane.trailWidth = 10;
        plane.move(randomSize);
        plane.turnLeft(90);
        plane.move(randomSize);
        plane.turnLeft(90);
        plane.move(randomSize);
        plane.turnLeft(90);
        plane.move(randomSize);
        // notice the direction your plane is facing at this point
    } //end of square


    public void bigSquare() {
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

    public void house() {
        plane.hasTrail = true;
        plane.setAngle(0);
        square(100);
        plane.setAngle(0);
        equitriangle(50);
        plane.hasTrail = false;
        plane.setAngle(270);
        plane.move(200);
        plane.hasTrail = true;
        plane.pausetime = 0;

    }

    public void equitriangle(int a) {
        plane.move(a);
        plane.turnLeft(120);
        plane.move(a);
        plane.turnLeft(120);
        plane.move(a);
        plane.turnLeft(120);

    }
    public void sun(int size) {
        plane.setTrailColor(255, 255, 0);
    }
}


