import programFiles.*;

/* Listing 7-2 */

public class DeviceController_WithExceptions {
    //…



    public void sendShutDown() {

        try {

            tryToShutDown();

        } catch (DeviceShutDownError e) {

            logger.log(e);

        }

    }



    private void tryToShutDown() throws DeviceShutDownError {

        DeviceHandle handle = getHandle(DEV1);

        DeviceRecord record = retrieveDeviceRecord(handle);



        pauseDevice(handle);

        clearDeviceWorkQueue(handle);

        closeDevice(handle);

    }



    private DeviceHandle getHandle(DeviceID id) throws DeviceShutDownError {

     //…

        throw new DeviceShutDownError("Invalid handle for: " + id.toString());

     //…

    }


    //…

    private DeviceID DEV1;
    RecordWriter record = new RecordWriter();
    Logger logger = new Logger();
    private void pauseDevice(DeviceHandle handle) {
    }

    private DeviceRecord retrieveDeviceRecord(DeviceHandle handle) {
        return null;
    }

    private void clearDeviceWorkQueue(DeviceHandle handle) {
    }

    private void closeDevice(DeviceHandle handle) {
    }
}
