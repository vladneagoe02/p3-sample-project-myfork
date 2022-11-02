package ro.uvt.p3.io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputDevice {
    OutputStream out;

    public OutputDevice() {
        out = System.out;
    }

    public OutputDevice(OutputStream out) {
        this.out = out;
    }

    public void writeMessage(Object msg){
        try {
            out.write(msg.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
