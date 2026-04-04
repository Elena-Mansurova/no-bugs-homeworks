package practice_6.museum;

public class Museum {

    Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void describeHistory() {
        System.out.println(exhibit.history());
    }

    public void printInfo() {
        System.out.println("Этот экспонат ");
        exhibit.preserve();
    }
}
