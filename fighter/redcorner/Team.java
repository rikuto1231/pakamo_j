package redcorner;

import fighter.Pokamon;


public class Team {
    //自変更
    private static final int MAX_FIGHTER = 3;
    
    public static String getName(){
        return "RMS";
    }

    public static Pokamon[] getFighters(){
        Pokamon[] fighters = new Pokamon[MAX_FIGHTER];

        //ここに自作したポカモンクラスを出したい順序に書きます
        fighters[2] = new PokamonWaters();
        fighters[1] = new PokamonFireSample();
        fighters[0] = new PokamonSteelSample();


        

        return fighters;
    }
}
