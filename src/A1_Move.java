public class A1_Move extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 0;
        plane.teleport(400,10);
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.setTrailColor(50, 50, 50);
        plane.trailWidth = 180;
        plane.move(550);
        plane.teleport(480,10);
        plane.setAngle(-270);
        plane.trailWidth = 20;
        plane.setTrailColor(255, 255, 255);
        plane.move(100);
        plane.hasTrail = false;
        plane.move(80);
        plane.hasTrail = true;
        plane.move (100);
        plane.hasTrail = false;
        plane.move(80);
        plane.hasTrail = true;
        plane.move (100);
        plane.hasTrail = false;
        plane.move(80);
        plane.hasTrail = true;
        plane.move (100);
        plane.teleport(10,10);
        plane.setTrailColor(180, 120, 30);
        plane.trailWidth = 400;
        plane.move (600);
        plane.teleport(570,10);
        plane.move(600);
        plane.setTrailColor(20, 10, 5);
        plane.trailWidth = 5;
        plane.teleport(200,600);
        plane.turnLeft(240);
        plane.move(100);
        plane.turnLeft(-30);
        plane.move(20);
        plane.turnLeft(-30);
        plane.move(50);
        plane.turnLeft(40);
        plane.move(100);
        plane.turnLeft(-100);
        plane.move(140);
        plane.turnLeft(70);
        plane.move(100);
        plane.turnLeft(-30);
        plane.move(20);
        plane.turnLeft(-30);
        plane.move(50);
        plane.turnLeft(40);
        plane.move(100);
        plane.turnLeft(-100);
        plane.move(140);
        plane.turnLeft(70);
        plane.teleport(750,600);
        plane.setAngle(180);
        shrubs();
        plane.teleport(800,520);
        shrubs();
        plane.teleport(820,400);
        shrubs();
        plane.teleport(670,355);
        shrubs();
        plane.teleport(850,280);
        shrubs();
        plane.teleport(660,125);
        shrubs();

    }
    public void shrubs () {
        int randGreen = plane.random (15, 160);
        plane.setTrailColor(0, randGreen, 0);
        plane.trailWidth = 50;
        plane.move(10);
        plane.turnLeft(30);
        plane.move(15);
    }

}


