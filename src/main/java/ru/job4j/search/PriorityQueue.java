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
                if (task.getPriority() >= element.getPriority()) {
                    index++;
                    break;
                }
            }
            tasks.add(index, task);
        }
    }

    public Task take() {
        return tasks.poll();
    }
}
