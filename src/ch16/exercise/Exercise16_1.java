package ch16.exercise;

public class Exercise16_1 {
    public static void main(String[] args) {
        byte[] ip = {(byte)192,(byte)168,(byte)10,(byte)100};
        byte[] subnet = {(byte)255,(byte)255,(byte)255,(byte)0};

        byte[] network = new byte[4];
        byte[] host = new byte[4];

        for(int i=0; i<ip.length; i++){
            network[i] = (byte)(ip[i] & subnet[i]);
            host[i] = (byte)(ip[i] & ~subnet[i]);
        }

        System.out.print("네트워크 주소: ");
        for(byte n:network){
            if(n<0) {
                System.out.print(n+256);
            }else{
                System.out.print(n);
            }
            System.out.print(".");
        }

        System.out.print("\n호스트 주소: ");
        for(byte h:host){
            if(h<0) {
                System.out.print(h+256);
                continue;
            }else {
                System.out.print(h);
            }
            System.out.print(".");
        }
    }
}
