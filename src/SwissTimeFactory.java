public class SwissTimeFactory implements WatchFactory{
    @Override
    public Watch createFactory() {
        return new SwissTime();
    }
}
