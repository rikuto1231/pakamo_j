package bluecorner;

import java.util.Random;

import fighter.PokamonSteel;

public class PokamonSteelSample extends PokamonSteel{
    
    public PokamonSteelSample(){
        super(60,20,10,5,5);
    }

    @Override
    public String getName() {
        return "デカムチャン";
    }

    @Override
    public boolean isSpecialAttack(int turn, int opHp, int opPow, int opDef) {
        Random r = new Random();
        if(r.nextInt(100) < 50){
            return true;
        }
        return false;
    }

    @Override
    public int getAttackType(int turn, int opHp, int opPow, int opDef) {
        Random r = new Random();
        if(r.nextInt(100) < 50){
            return FULLPOW_ATTACK;
        }
        return NORMAL_ATTACK;
    }
}
