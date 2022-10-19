package ro.uvt.p3;

import ro.uvt.p3.io.InputDevice;
import ro.uvt.p3.io.OutputDevice;

public class Main {
// comment
    public static void main(String[] args) {
        InputDevice id = new InputDevice();
        OutputDevice od = new OutputDevice();
        Application app = new Application(id, od);

        app.run();
    }
}