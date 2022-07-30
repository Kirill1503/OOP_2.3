package pro.sky.java.homeworks.course2.lesson1;

public class Truck extends WeelanleTransport implements Service {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем грузовик " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель угрузовика");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }
}