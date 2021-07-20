package Zoo;

public interface Cage {
    //primary key
    int getNumber();
    double getArea();
    Condition getCondition();
    boolean isVacantCage();
}
