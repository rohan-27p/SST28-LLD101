public class AttendanceScanner implements PowerControl, AttendanceCapable {
    @Override public void powerOn() { }

    @Override public void powerOff() { }

    @Override public int scanAttendance() {
        return 3;
    }
}