public class TissotFactory implements WatchFactory {
    @Override
    public Watch createFactory() {
        return new Tissot();
    }
}
