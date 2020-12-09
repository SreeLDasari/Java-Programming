
public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer == true){
            return temperature > 24 && temperature < 46;
        } else {
                return temperature > 24 && temperature < 36;
        }
    }
}