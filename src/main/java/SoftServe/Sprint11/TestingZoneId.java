package SoftServe.Sprint11;

import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestingZoneId {
    public static void main(String[] args) {

        ZoneId kyivZone = ZoneId.of("Europe/Kiev");
        System.out.println("ZoneId for Kyiv: " + kyivZone);

    }
}
