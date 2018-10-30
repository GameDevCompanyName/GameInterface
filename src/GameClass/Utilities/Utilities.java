package GameClass.Utilities;

import GameClass.Items.Weapons.WeaponType;

import java.util.Random;

public class Utilities {

    public static Object getRandomElement(Object[] array, Random randomGenerator) {
        int index = randomGenerator.nextInt(array.length);
        return array[index];
    }

}
