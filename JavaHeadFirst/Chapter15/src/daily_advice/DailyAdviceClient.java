/*
 * File: DailyAdviceClient.java
 * Project: daily_advice_client
 * File Created: Tuesday, 8th March 2022 4:17:18 pm
 * Author: tung.dao (thanhtungpfiev@gmail.com)
 * -----
 */
package daily_advice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
    public void go() {
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
