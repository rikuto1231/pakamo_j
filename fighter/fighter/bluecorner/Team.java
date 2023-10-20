package bluecorner;

import fighter.Pokamon;
import redcorner.PokamonSteelSample;
import redcorner.PokamonVoltSample;

public class Team {
    //自変更
    private static final int MAX_FIGHTER = 3;
    
    public static String getName(){
        //TODO:ここにチーム名を入れる
        return "チーム名";
    }

    public static Pokamon[] getFighters(){
        Pokamon[] fighters = new Pokamon[MAX_FIGHTER];

        //ここに自作したポカモンクラスを出したい順序に書きます
        fighters[0] = new PokamonFireSample();//炎
        fighters[1] = new PokamonVoltSample();//雷
        fighters[2] = new PokamonSteelSample();//鋼

        

        return fighters;
    }
}
