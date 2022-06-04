public class BubbleSort {
    private int[] data;
    private String[] dataStr;

    //constructor
    public BubbleSort(){
    }

    public int[] getData() { return data; }

    public void setData(int[] data) {
        this.data = data;
    }

    public void sortData(){
        int lenData = this.data.length;
        for(int i = 0; i<lenData; i++){
            for (int j = i+1; j<lenData; j++){
                if (this.data[j]<this.data[i]){
                    int temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = temp;
                }
            }
        }
    }

    public void PrintData(){
        for (int datum : this.data){
            System.out.println(datum+" ");
        }
    }

    //
    //Sort String
    public String[] getDataStr() {return dataStr; }
    
    public void setDataStr(String[] dataStr) {
        this.dataStr = dataStr;
    }

    public void sortDataStr(int n){
        int lenDataStr = n;
        for(int i = 0; i<lenDataStr; i++){
            for (int j = i+1; j<lenDataStr; j++){
                if (this.dataStr[i].compareTo(this.dataStr[j]) > 0){
                    String temp = this.dataStr[i];
                    this.dataStr[i] = this.dataStr[j];
                    this.dataStr[j] = temp;
                }
            }
        }
    }

    public void PrintDataStr(){
        for (String datum : this.dataStr){
            System.out.println(datum+" ");
        }
    }


    public static void main(String[] args) {
        int[] s = new int[] {10,35,32,13,26};
        String[] nama = {"Adi","Mang","Jordy","Febry","Sholeh"};
        int b = nama.length;
        
        BubbleSort _myBubble = new BubbleSort();
        _myBubble.setData(s);
        _myBubble.sortData();
        _myBubble.PrintData();

        BubbleSort _myBubbleStr = new BubbleSort();
        _myBubbleStr.setDataStr(nama);
        _myBubbleStr.sortDataStr(b);
        _myBubbleStr.PrintDataStr();
    }
}
