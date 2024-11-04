public class GameRunner {

    private Game game;
    private boolean isPause;

    private static GameRunner instance;

    private GameRunner()
    {
        System.out.println(Message.FREE);
    }

    public static GameRunner getInstance()
    {
        if(instance == null)
        {
            instance = new GameRunner();
        }
        return instance;
    }

    private String setGame(Game game) throws Exception {
        this.game = game; //chưa kiểm tra game gốc trên máy
        setPause(true);
        return launch(game);
    }

    private String launch(Game game) throws Exception {
        if (game == null) { //kiểm tra game nhập vào
            return "";
        }
        return String.format(Message.LAUNCHING, game) + "\n" + resume();
    }

    public String resume() throws Exception {
        if(this.game == null) //kiểm tra game gốc trên máy
        {
            throw new Exception(Message.NO_GAMES_RUNNING);
        }
        if(!isPause) //nếu game gốc vẫn đang chạy thì
        {
            return String.format(Message.ALREADY_RUNNING, game);
        }
        setPause(false);
        return String.format(Message.RUN, game);
    }

    private void setPause(boolean b) {
        this.isPause = b;
    }

    public String run(Game game) throws Exception {
        if(this.game != null && game == null)
        {
            return String.format(Message.NO_INTERRUPTION, this.game);
        }
        else if (this.game == null)
        {
            setGame(game);
        }
        else if (this.game.equals(game))
        {
            resume();
        }
        return pause() + "\n" + close() + "\n" + setGame(game);
    }

    public String pause() throws Exception {
        if(this.game == null)
        {
            throw new Exception(Message.NO_GAMES_RUNNING);
        }

        if(isPause)
        {
            return String.format(Message.ALREADY_PAUSE, this.game);
        }
        setPause(true);
        return String.format(Message.PAUSE, this.game);
    }

    public String close() throws Exception {
        if(this.game == null)
        {
            throw new Exception(Message.NO_GAMES_RUNNING);
        }
        return ((isPause) ? pause() + "\n" : "") + String.format(Message.CLOSE_GAME, this.game);
    }

}
