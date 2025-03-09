package DFS와BFS_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int v = Integer.parseInt(split[2]);
        int[][] arr = new int[1001][1001];

        for (int i = 0; i < m; i++) {
            String s1 = br.readLine();
            String[] split1 = s1.split(" ");
            int a = Integer.parseInt(split1[0]);
            int b = Integer.parseInt(split1[1]);

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        Dfs dfs = new Dfs(n, v, arr);
        List<Integer> resultDfs = dfs.run();
        for (Integer i : resultDfs) {
            System.out.print(i + " ");
        }

        System.out.println();
        Bfs bfs = new Bfs(n, v, arr);
        List<Integer> resultBfs = bfs.run();
        for (Integer i : resultBfs) {
            System.out.print(i + " ");
        }

    }
}

class Bfs {
    private final int n;
    private final int v;
    private final int[][] arr;
    private List<Integer> result;
    private int[] mask;
    private Deque<Integer> q;

    public Bfs(int n, int v, int[][] arr) {
        this.n = n;
        this.v = v;
        this.arr = arr;
    }

    public List<Integer> run() {
        result = new ArrayList<>();
        q = new ArrayDeque<>();
        mask = new int[n + 1];

        bfs();
        return result;
    }

    private void bfs() {
        q.offer(v);
        mask[v] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();
            result.add(now);

            for (int i = 1; i <= n; i++) {
                if (mask[i] == 1 || arr[now][i] == 0) continue;

                q.offer(i);
                mask[i] = 1;
            }
        }
    }
}


class Dfs {
    private final int n;
    private final int v;
    private final int[][] arr;
    private List<Integer> result;
    private int[] mask;

    public Dfs(int n, int v, int[][] arr) {
        this.n = n;
        this.v = v;
        this.arr = arr;
    }

    public List<Integer> run() {
        result = new ArrayList<>();
        mask = new int[n + 1];

        dfs(v);
        return result;
    }

    private void dfs(int now) {
        result.add(now);
        mask[now] = 1;

        for (int i = 1; i <= n; i++) {
            if (arr[now][i] == 0 || mask[i] != 0) continue;
            dfs(i);
        }
    }
}
