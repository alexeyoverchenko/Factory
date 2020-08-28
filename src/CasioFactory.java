public class CasioFactory implements WatchFactory{
    @Override
    public Watch createFactory() {
        return new Casio();
    }
}
