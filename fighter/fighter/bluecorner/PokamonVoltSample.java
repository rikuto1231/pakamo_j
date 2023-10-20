package bluecorner;

import java.util.Random;

import fighter.PokamonVolt;

public class PokamonVoltSample extends PokamonVolt{
    
    public PokamonVoltSample(){
        super(35,10,5,10,40);
    }

    @Override
    public String getName() {
        return "パチリス";
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
