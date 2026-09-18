class CustomStack {
    int[] arr;
    int idx = 0;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
    }

    public void push(int x) {
        if (idx == arr.length) return;

        arr[idx] = x;
        idx++;
    }

    public int pop() {
        if (idx == 0) return -1;

        idx--;
        return arr[idx];
    }

    public void increment(int k, int val) {
        int t = Math.min(k, idx);

        for (int j = 0; j < t; j++) {
            arr[j] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */