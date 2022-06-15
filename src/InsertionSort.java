public class InsertionSort {


    private String[] data;

    public void setData(String[] data) { this.data = data;}

    public void InsertionSort() {
        int size = this.data.length;

        for (int step = 1; step < size; step++){
            String key = this.data[step];
            int j = step - 1;

            // compare key with each element on the left of it until
            // it is found
            // for descending order
            while (j >= 0 && key.compareTo( this.data[j]) < 0) {
                this.data[j + 1] = this.data[j];
                --j;
            }

            this.data[j + 1] = key;
        }
    }

    public void PrintSort() {
        for (int i=0; i<this.data.length;i++){
            System.out.println(this.data[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] age = {12,7,2,1,0,67,78,95};
        String[] nama = {"windy","Budi","Susi","Agus","Beni"};
//
//        InsertionSort _myIns = new InsertionSort();
//        _myIns.setData(age);
//        _myIns.InsertionSort();
//        _myIns.PrintSort();

        InsertionSort _myInsStr = new InsertionSort();
        _myInsStr.setData(nama);
        _myInsStr.InsertionSort();
        _myInsStr.PrintSort();
    }
}
