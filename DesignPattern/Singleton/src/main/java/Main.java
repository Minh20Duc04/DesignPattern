public class Main {
    private static final Game callOfDuty = new Game("Call of duty");
    private static final Game Mario = new Game("Mario");

    public static void main(String[] args) throws Exception {
        GameRunner gameRunner = GameRunner.getInstance();
        System.out.println(gameRunner.run(Mario));
        System.out.println(gameRunner.pause());
        System.out.println(gameRunner.resume());
        System.out.println(gameRunner.close());
        System.out.println(gameRunner.run(callOfDuty));

    }
}
