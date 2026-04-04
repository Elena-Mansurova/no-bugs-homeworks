package practice_6.museum;

public class Manuscript implements Exhibit{

    @Override
    public String history() {
        return "создан 2000 лет назад";
    }

    @Override
    public void preserve() {
        System.out.println("нуждается в контроле температуры и влажности");
    }
}
