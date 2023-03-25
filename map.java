import java.io.*;
import java.lang.*;
import java.util.HashMap;

public class map {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] p = br.readLine().split(" ");
            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            for (int i = 0; i < 2; i++) {
                String a = p[i];
                for (int j = 0; j < a.length(); j++) {
                    if (hm.containsKey(a.charAt(j))) {
                        hm.put(a.charAt(j), hm.get(a.charAt(j)) + 1);
                    } else {
                        hm.put(a.charAt(j), 1);
                    }
                }
            }
            int n = Integer.parseInt(br.readLine());
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }
            boolean ans = true;
            for (int i = 0; i < n; i++) {
                String h = arr[i];
                for (int j = 0; j < h.length(); j++) {
                    if (hm.containsKey(h.charAt(j))) {
                        if (hm.get(h.charAt(j)) < 1) {
                            ans = false;
                        } else {
                            hm.replace(h.charAt(j), hm.get(h.charAt(j)) - 1);
                        }
                    } else {
                        ans = false;
                    }
                }
            }
            if (ans) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
