package fr.isen.ticketapp.interfaces.services;

import java.util.List;
import fr.isen.ticketapp.interfaces.models.DeviceModel;

public interface DeviceService {
    DeviceModel getDeviceById(final int id);

    DeviceModel updateDevice(final DeviceModel newDevice);

    List<DeviceModel> getAllDevices();

    boolean removeDevice(final int deviceId);

    DeviceModel addDevice(final DeviceModel device);

}
