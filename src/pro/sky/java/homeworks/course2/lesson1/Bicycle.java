package pro.sky.java.homeworks.course2.lesson1;

public class Bicycle extends WeelanleTransport implements Service {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
    private void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }
}