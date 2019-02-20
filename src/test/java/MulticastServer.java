import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MulticastServer {

    public static void main(String[] args) {
        try {

            //地址段 ：224.0.0.0 - 239.255.255.255
            InetAddress group = InetAddress.getByName("225.0.0.0");

            MulticastSocket socket = new MulticastSocket();

            for (int i = 0; i < 10; i++) {
                String data = "hello moon";
                byte[] bytes = data.getBytes();
                socket.send(new DatagramPacket(bytes, bytes.length, group, 5555));
                TimeUnit.SECONDS.sleep(2);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
