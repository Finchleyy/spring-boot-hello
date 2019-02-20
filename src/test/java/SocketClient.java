import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//read
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);//write

            writer.print("hello moon");
            writer.write(java.security.AccessController.doPrivileged(
                    new sun.security.action.GetPropertyAction("line.separator")));
            writer.flush();
            while (true) {
                String serverData = reader.readLine();

                if (serverData == null) {
                    break;
                }

                System.out.println("客户端收到数据：" + serverData);
            }

            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
