class BigO {
    public static void printItems(int n){
        for (int i =0;i<n; i++){
            System.out.println(i);
        }

//        This is O(N)
    }

    public static void printItems2(int n){
        for (int i =0;i<n; i++){
            System.out.println(i);
        }

        for (int j =0;j<n; j++){
            System.out.println(j);
        }
//    O(2N) -> O(N) We can remove constants for simplification because we are interested in long term rate.

    }

    public static void printItems3(int n){
        for  (int i =0 ; i < n; i++){
            for  (int j = 0; j < n; j++){
                System.out.println(i+ "-" + j);
            }
        }

//        This is a nest loop. This is O(N^2)
    }

    public static void printItems4(int n){
        for  (int i =0 ; i < n; i++){
            for  (int j = 0; j < n; j++){
                System.out.println(i+ "-" + j);
            }
        }
//      First loop is O(N^2)

        for (int k = 0; k <n; k++){
            System.out.println(k);
        }

//        Second Loop is O(N)

//        In this case we have O(N^2) + O(N) -> O(N^2+N)
//        We can apply rule of non dominants here. The N^2 grows much faster than the N, and long term the N becomes
//        insignificant compared to the N^2 term.

//        This this becomes O(N^2)
    }

    public static int addItems(int n){
        return n+n;

//        This is O(1). No matter the input, the number of operations does not grow.
//        This is called constant time.
//        For any constant x, if we have O(x) we always simplify this to O(1).
    }



    public static void main(String[] args){
        printItems3(10);
    }


}