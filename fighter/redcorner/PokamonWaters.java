
package redcorner;

import java.util.Random;

import fighter.PokamonWater;

public class PokamonWaters extends PokamonWater{
    
    public PokamonWaters(){
        super(30,0,20,31,19);
    }

    @Override
    public String getName() {
        return "コイキング先輩";
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
