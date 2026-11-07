import java.util.*;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {

        // Free servers: [weight, index]
        PriorityQueue<int[]> free = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);

                return Integer.compare(a[1], b[1]);
            }
        );

        // Busy servers: [freeTime, weight, index]
        PriorityQueue<long[]> busy = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return Long.compare(a[0], b[0]);

                if (a[1] != b[1])
                    return Long.compare(a[1], b[1]);

                return Long.compare(a[2], b[2]);
            }
        );

        // Initially all servers are free
        for (int i = 0; i < servers.length; i++) {
            free.offer(new int[]{servers[i], i});
        }

        int[] ans = new int[tasks.length];

        long time = 0;

        for (int i = 0; i < tasks.length; i++) {

            // Task i arrives at time i
            time = Math.max(time, i);

            // Move all servers that are free now
            while (!busy.isEmpty() && busy.peek()[0] <= time) {

                long[] server = busy.poll();

                // IMPORTANT:
                // free heap needs [weight, index]
                free.offer(new int[]{
                    (int) server[1],
                    (int) server[2]
                });
            }

            // If no server is free, wait for the next server
            if (free.isEmpty()) {

                time = busy.peek()[0];

                // Move all servers that become free at this time
                while (!busy.isEmpty() && busy.peek()[0] <= time) {

                    long[] server = busy.poll();

                    free.offer(new int[]{
                        (int) server[1],
                        (int) server[2]
                    });
                }
            }

            // Get the best available server
            int[] server = free.poll();

            int weight = server[0];
            int index = server[1];

            ans[i] = index;

            // This server will become free after this task finishes
            busy.offer(new long[]{
                time + tasks[i],
                weight,
                index
            });
        }

        return ans;
    }
}