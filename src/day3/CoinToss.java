package src.day3;

import java.util.Random;

public class CoinToss {

    public String tossACoin(){
        Random random = new Random();
        int coinToss = Math.abs(random.nextInt()%2);
        if (coinToss == 0){
            return "Heads";
        } else{
            return "Tails";
        }
    }
    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
}
