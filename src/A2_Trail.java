public class A2_Trail extends World {

    public void go() {

        System.out.println("Change the thickness of the trail behind the plane");


    }

    public void house(int Size) {
        plane.hasTrail = true;
        plane.setAngle(0);
        plane.setAngle(0);
        equitriangle();
        plane.hasTrail = false;
        plane.setAngle(270);
        plane.move(200);
        plane.hasTrail = true;
        plane.pausetime = 0;

    }
    public void equitriangle() {
        plane.move(100);
        plane.turnLeft(120);
        plane.move(100);
        plane.turnLeft(120);
        plane.move(100);
        plane.turnLeft(120);
    }
}