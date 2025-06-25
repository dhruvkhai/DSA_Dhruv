class Solution {
    public void moveZeroes(int[] arr) {
        // int n = arr.length;

        //     if (n <= 1) {
        //         return;
        //     }
        //     int lastnonxeroindex = 0;

        //     for (int i = 0; i < n; i++) {
        //         if (arr[i] != 0) {
        //             if (i != lastnonxeroindex) {
        //                 int temp = arr[i];
        //                 arr[i] = arr[lastnonxeroindex];
        //                 arr[lastnonxeroindex] = temp;
        //             }
        //             lastnonxeroindex++;
        //         }

        //     }
        // }

        int j = 0;
        int n = arr.length;
        int[] temp = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                cnt++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < cnt; i++) {
            temp[j + i] = 0;
        }
        for(int i = 0; i<n;i++){
            arr[i]= temp[i];
        }
    }

}
