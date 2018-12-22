package fiboDemo;

public class TofayelVaiP {
    public static void main(String[] args) {
        int porernumber=0;
        int agernumber=1;

        for(int j=0;j<10;j++){
            porernumber=agernumber+porernumber;
            agernumber=porernumber-agernumber;
            System.out.println(porernumber);
        }
    }
}
//;jhihigiufyuimran