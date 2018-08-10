import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class MulticastClient {

    public static void main(String[] args) {

        try {
            //地址段 ：224.0.0.0 - 239.255.255.255
            InetAddress group = InetAddress.getByName("225.0.0.0");
            //System.setProperty("java.net.preferIPv4Stack", "true");
            MulticastSocket socket = new MulticastSocket(5555);
            socket.joinGroup(group); //加入指定的组
            byte[] bytes = new byte[256];
            while (true){
                DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
                socket.receive(datagramPacket);
                String string = new String(datagramPacket.getData());
                System.out.println("接收到的数据:"+string);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
