package sample;

import java.util.Random;

public class RandomIndex {

    public int random012(){
        int [] array = {0,1,2};
        int index = new Random().nextInt(array.length);
        System.out.println("Random: " + array[index]);
        return array[index];
    }

    public int random02() {
        int[] array = {0, 2};
        int x = new Random().nextInt(array.length);
        return array[x];
    }

}
