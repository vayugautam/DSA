import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B_Variety_is_Discouraged {
    static class SegTree {
        int n;
        long[] seg;
        int[] idx;
        long[] lazy;
        
        public SegTree(int n) {
            this.n = n;
            seg = new long[4 * n];
            idx = new int[4 * n];
            lazy = new long[4 * n];
            build(1, 1, n);
        }
        void build(int node, int l, int r) {
            if(l == r) {
                seg[node] = -l; 
                idx[node] = l;
                return;
            }
            int mid = (l + r) >> 1;
            build(node * 2, l, mid);
            build(node * 2 + 1, mid + 1, r);
            merge(node);
        }
        void merge(int node) {
            int left = node * 2, right = node * 2 + 1;
            if(seg[left] > seg[right]) {
                seg[node] = seg[left];
                idx[node] = idx[left];
            } else if(seg[left] < seg[right]) {
                seg[node] = seg[right];
                idx[node] = idx[right];
            } else {
                seg[node] = seg[left]; 
                idx[node] = Math.max(idx[left], idx[right]);
            }
        }
        void pushDown(int node, int l, int r) {
            if(lazy[node] != 0) {
                int mid = (l + r) >> 1;
                apply(node * 2, l, mid, lazy[node]);
                apply(node * 2 + 1, mid + 1, r, lazy[node]);
                lazy[node] = 0;
            }
        }
        void update(int node, int l, int r, int ql, int qr, long val) {
            if(ql > r || qr < l) return;
            if(ql <= l && r <= qr) {
                apply(node, l, r, val);
                return;
            }
            pushDown(node, l, r);
            int mid = (l + r) >> 1;
            update(node * 2, l, mid, ql, qr, val);
            update(node * 2 + 1, mid + 1, r, ql, qr, val);
            merge(node);
        }
        
        void apply(int node, int l, int r, long val) {
            seg[node] += val;
            lazy[node] += val;
        }
        long[] query(int node, int l, int r, int ql, int qr) {
            if(ql > r || qr < l) return new long[]{- (long)1e18, -1}; // very small
            if(ql <= l && r <= qr) {
                return new long[]{seg[node], idx[node]};
            }
            pushDown(node, l, r);
            int mid = (l + r) >> 1;
            long[] leftAns = query(node * 2, l, mid, ql, qr);
            long[] rightAns = query(node * 2 + 1, mid + 1, r, ql, qr);
            if(leftAns[0] > rightAns[0]) return leftAns;
            else if(leftAns[0] < rightAns[0]) return rightAns;
            else {
                if(leftAns[1] > rightAns[1]) return leftAns;
                else return rightAns;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split("\\s+");
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(parts[i-1]);
            }
            // Precompute first and last occurrence for each distinct element.
            int[] firstOcc = new int[n+1];
            int[] lastOcc = new int[n+1];
            Arrays.fill(firstOcc, n+1);
            Arrays.fill(lastOcc, 0);
            for (int i = 1; i <= n; i++) {
                int x = a[i];
                firstOcc[x] = Math.min(firstOcc[x], i);
                lastOcc[x] = Math.max(lastOcc[x], i);
            }
            ArrayList<ArrayList<Integer>> starts = new ArrayList<>(n+2);
            for (int i = 0; i <= n+1; i++) {
                starts.add(new ArrayList<>());
            }
            int distinct = 0;
            for (int x = 1; x <= n; x++) {
                if(lastOcc[x] != 0) { 
                    distinct++;
                    starts.get(firstOcc[x]).add(lastOcc[x]);
                }
            }
            long bestG = - (long)1e18; 
            int bestL = -1, bestR = -1, bestRemovalLength = -1;
            SegTree segTree = new SegTree(n);
            for (int l = n; l >= 1; l--) {
                for (int rVal : starts.get(l)) {
                    segTree.update(1, 1, n, rVal, n, 1);
                }
                long[] queryRes = segTree.query(1, 1, n, l, n);
                long curVal = queryRes[0] + (l - 1);  
                int rOpt = (int) queryRes[1];
                int removalLength = rOpt - l + 1;
                if(curVal > bestG || (curVal == bestG && removalLength > bestRemovalLength)) {
                    bestG = curVal;
                    bestL = l;
                    bestR = rOpt;
                    bestRemovalLength = removalLength;
                }
            }
            if(bestG < 0) {
                out.println(0);
            } else {
                out.println(bestL + " " + bestR);
            }
        }
        out.flush();
        out.close();
    }
}