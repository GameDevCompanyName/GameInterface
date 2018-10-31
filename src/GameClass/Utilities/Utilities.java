package GameClass.Utilities;

import GameClass.Items.Weapons.WeaponType;

import java.util.Random;

public class Utilities {

    public static Object getRandomElement(Object[] array, Random randomGenerator) {
        if (array.length == 0)
            return null;
        int index = randomGenerator.nextInt(array.length);
        return array[index];
    }

}
