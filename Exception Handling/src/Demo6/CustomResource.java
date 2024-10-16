package Demo6;

public class CustomResource {
    public CustomResource() {
        System.out.println("Custom Resource Started");
    }

    public void process() {
        System.out.println("Custom Resource Processing");
    }

    public void close() {
        System.out.println("Custom Resource Finished");
    }
}
