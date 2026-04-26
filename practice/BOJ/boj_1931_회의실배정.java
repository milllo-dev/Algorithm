package practice.BOJ;

import java.io.*;
import java.util.*;

public class boj_1931_회의실배정 {
    static class TimeTable implements Comparable<TimeTable> {
        int startTime;
        int endTime;

        TimeTable(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(TimeTable o) {
            if (Integer.compare(endTime, o.endTime) == 0) {
                return Integer.compare(startTime, o.startTime);
            } else {
                return Integer.compare(endTime, o.endTime);
            }
        }

        @Override
        public String toString() {
            return startTime + " " + endTime;
        }
    }

    static int N;
    static int lastEndTime;
    static TimeTable[] tb;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());
        tb = new TimeTable[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            tb[i] = new TimeTable(start, end);
        }

        Arrays.sort(tb);

        for (TimeTable t : tb) {
            if (t.startTime < lastEndTime) {
                continue;
            }

            lastEndTime = t.endTime;
            count++;
        }

        System.out.println(count);

        reader.close();
    }
}
