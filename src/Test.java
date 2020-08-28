public class Test {
    public static void main(String[] args) {
        WatchFactory watchFactory = createWatchBySpeciality("Tissot");
        Watch watch = watchFactory.createFactory();
        watch.createWatch();
    }

    static WatchFactory createWatchBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("SwissTime")) {
            return new SwissTimeFactory();
        } else if (speciality.equalsIgnoreCase("Tissot")) {
            return new TissotFactory();
        } else if (speciality.equalsIgnoreCase("Casio")) {
            return new CasioFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown");
        }
    }
}
