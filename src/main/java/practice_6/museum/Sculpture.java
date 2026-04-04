package practice_6.museum;

public class Sculpture implements Exhibit{

    @Override
    public String history() {
        return "создана в Древней Греции";
    }

    @Override
    public void preserve() {
        System.out.println("требует регулярной реставрации");
    }
}
