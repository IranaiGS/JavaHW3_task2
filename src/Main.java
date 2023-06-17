public class Main {
    public static void main(String[] args) {
      BmiService service = new BmiService();
      int index;
        index = service.calculate(1.68F,54);
        System.out.println(index + " индекс массы тела");
    }
}
