package pro.sky.java.homeworks.course2.lesson1;

public class Car extends WeelanleTransport implements Service {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем машину " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}