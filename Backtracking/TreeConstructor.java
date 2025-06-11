public class TreeConstructor {
    public static int[] constructTree(int n, int d, int l) {
        if (d > n - 1 || l > n || d < 2) {
            return null; 
        }

        int[] tree = new int[n];

        if (d == n - 1) {
            for (int i = 0; i < n; i++) {
                tree[i] = i + 1;
            }
            return tree;
        }

        if (d < n - 1) {
            int pathLength = d + 1;
            for (int i = 0; i < pathLength; i++) {
                tree[i] = i + 1;
            }
            int leafIndex = pathLength + 1;
            for (int i = pathLength; i < n; i++) {
                tree[i] = leafIndex++;
            }
            return tree;
        }

        if (d == 2) {
            tree[0] = 1;
            for (int i = 1; i < n; i++) {
                tree[i] = i + 2;
            }
            return tree;
        }

        return null;
    }

    public static void main(String[] args) {
        int n = 10, d = 4, l = 6;
        int[] tree = constructTree(n, d, l);
        if (tree != null) {
            for (int value : tree) {
                System.out.print(value + " ");
            }
        }
    }
}


