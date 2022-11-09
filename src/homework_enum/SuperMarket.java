package homework_enum;

import java.util.*;

public class SuperMarket{
    private final static Random RANDOM = new Random();

    private final List<Queue<String>> queues;

    public SuperMarket() {
        this.queues = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            this.queues.add(new ArrayDeque<>(5));
            fillRandomClients(i);
        }
    }

    public void addPersonToQueue(String name) {
        if (allQueueIsFull()) {
            System.out.println("Позовите Галю");
        } else {
            selectLess().add(name);
        }
    }

    public final void remove() throws RuntimeException {
        try {
            this.queues.get(RANDOM.nextInt(0, queues.size())).remove();
        } catch (RuntimeException e) {
            System.out.println("Очередь итак уже пуста!");
        }
    }

    private boolean allQueueIsFull() {
        for (Queue<String> queue : queues) {
            if (queue.size() < 5) {
                return false;
            }
        }
        return true;
    }

    public Queue<String> selectLess() {
        int min = Integer.MAX_VALUE;
        Queue<String> target = null;
        for (Queue<String> queue : queues) {
            if (queue.size() < min) {
                min = queue.size();
                target = queue;
            }
        }
        return target;
    }

    public void fillRandomClients(int i) {
        for (int j = 0; j < RANDOM.nextInt(0,6); j++) {
            this.queues.get(i).add("queue" + (i + 1) + "_person" + (j + 1));
        }
    }

    public List<Queue<String>> getQueues() {
        return queues;
    }
}
