import java.util.*;

public class C_I_Will_Definitely_Make_It {
    static class State {
        int index;
        long time;
        State(int index, long time) {
            this.index = index;
            this.time = time;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt() - 1;
            long[] h = new long[n];
            long maxH = 0;
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextLong();
                maxH = Math.max(maxH, h[i]);
            }
            boolean[] visited = new boolean[n];
            long[] time = new long[n];
            Arrays.fill(time, Long.MAX_VALUE);
            time[k] = 0;
            Queue<State> q = new LinkedList<>();
            q.add(new State(k, 0));
            visited[k] = true;
            boolean found = false;
            while (!q.isEmpty()) {
                State curr = q.poll();
                int i = curr.index;
                long t = curr.time;
                if (h[i] == maxH) {
                    found = true;
                    break;
                }
                long maxDiff = h[i] - t;
                if (maxDiff <= 0) continue;

                for (int j = 0; j < n; j++) {
                    if (!visited[j] && Math.abs(h[i] - h[j]) <= maxDiff) {
                        long newTime = t + Math.abs(h[i] - h[j]);
                        if (newTime < time[j]) {
                            time[j] = newTime;
                            visited[j] = true;
                            q.add(new State(j, newTime));
                        }
                    }
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }
}
