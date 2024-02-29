import programFiles.*;

// Listing 7-1

public class DeviceController {
     //…

    public void sendShutDown() {

        DeviceHandle handle = getHandle(DEV1);

        // Check the state of the device

        if (handle != DeviceHandle.INVALID) {

            // Save the device status to the record field

            retrieveDeviceRecord(handle);

            // If not suspended, shut down

            if (record.getStatus() != DEVICE_SUSPENDED) {

                pauseDevice(handle);

                clearDeviceWorkQueue(handle);

                closeDevice(handle);

            } else {

                logger.log("Device suspended.  Unable to shut down");

            }

        } else {

            logger.log("Invalid handle for: " + DEV1.toString());

        }

    }
    //…


    RecordWriter record = new RecordWriter();
    Logger logger = new Logger();
    private DeviceID DEV1;
    private final boolean DEVICE_SUSPENDED = true;
    DeviceHandle getHandle(DeviceID devNum) {
        return null;
    }

    private void pauseDevice(DeviceHandle handle) {
    }

    private void retrieveDeviceRecord(DeviceHandle handle) {
    }

    private void clearDeviceWorkQueue(DeviceHandle handle) {
    }

    private void closeDevice(DeviceHandle handle) {
    }
}
