public class program5_point4 {
    public static void main(String[] args) {
        Answer arr=null;
        arr=new Answer();
        arr.insert(00);
        arr.insert(11);
        arr.insert(22);
        arr.insert(33);
        arr.insert(44);
        arr.insert(55);
        arr.insert(66);
        arr.insert(77);
        arr.insert(88);
        arr.display();
        int searchkey =99;
        if(arr.find(searchkey)){
            System.out.println("found :"+searchkey);
        }else {
            System.out.println("can't found :"+searchkey);
            arr.delete(00);
            arr.delete(55);
            arr.delete(66);
            arr.display();
        }
    }
}
class Answer{
    int a[]=new int[50];
    int b=0;
    public boolean find (long searchKey){
        int j;
        for(j=0;j<b;j++)
            if(a[j]==searchKey){
                System.out.println(a[j]+": Found ");
                break;
            }
        if(j==b)
            return false;
        else
            return true;
    }
    public void insert(int value){
        a[b]=value;
        b++;
    }
    public boolean delete(int value){
        int j;
        for (j=0;j<b;j++)
            if(value==a[j]) {
                break;
            }
            if(j==b)
                return false;
            else {
                for(int k=j;k<b;k++)
                    a[k]=a[k+1];
                b--;
                return true;
            }
    }
    public void display(){
        for (int j=0;j<b;j++){
            System.out.println(a[j]);
            System.out.println("--------");
        }
    }

}