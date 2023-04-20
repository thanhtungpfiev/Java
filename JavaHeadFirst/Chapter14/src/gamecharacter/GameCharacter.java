package gamecharacter;

import java.io.Serializable;

/**
 * @author Admin
 * @date 3/6/2022
 */
public class GameCharacter implements Serializable {
    int power;
    String type;
    String[] weapons;

    public GameCharacter(int p, String t, String[] w) {
        power = p;
        type = t;
        weapons = w;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public String getWeaponsString() {
        String weaponList = "";
        for (int i = 0; i < weapons.length; ++i) {
            weaponList += weapons[i] + " ";
        }
        return  weaponList;
    }
}
