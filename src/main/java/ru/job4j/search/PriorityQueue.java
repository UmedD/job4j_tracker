package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        if (tasks.isEmpty()) {
            tasks.add(0, task);
        } else {
            int index = 0;
            for (Task element : tasks) {
                if (element.getPriority() > task.getPriority()) {
                    break;
                }
                index++;
            }
            tasks.add(index, task);
        }
    }

    public Task take() {
        return tasks.poll();
    }
}
