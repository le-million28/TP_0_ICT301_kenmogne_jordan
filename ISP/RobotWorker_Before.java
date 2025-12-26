class RobotWorker implements Worker {
    public void work() {
        System.out.println("Les Robots travaillent");
    }
    public void eat() {
        throw new UnsupportedOperationException("Les Robots ne mangent pas");
    }
}
