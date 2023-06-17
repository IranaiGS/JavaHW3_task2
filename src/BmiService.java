public class BmiService {
    public int calculate(float height, int weight) {
        float index = (weight / (height * height)) ;
        return (int) index;
    }
}