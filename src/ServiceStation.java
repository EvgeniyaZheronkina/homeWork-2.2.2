public class ServiceStation {
    public void check(Servicable... transports) {
        for (Servicable transport : transports) {
            transport.repair();
        }
    }

}