package homework_enum.transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> carsQueue = new LinkedList<>();

    public void addToServiceQueue(Transport... transports) {
        System.out.println("Сервис принимает заявки:");
        for (Transport t : transports) {
            if (t.getClass() == Bus.class) {
                System.out.println(t + " - нельзя добавить в списокТехОсм");

            } else {
                carsQueue.offer(t);
                System.out.println(t + " - добавлен в списокТехОсм");
            }
        }
    }

    public void performInspection(){
        Transport car = carsQueue.poll();
        if (car != null) {
            System.out.println(car + " - ТО проведено.");
            performInspection();
        } else {
            System.out.println("В очереди больше нет машин.");
        }

    }

    public Queue<Transport> getCarsQueue() {
        return carsQueue;
    }
}
