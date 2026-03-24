package pen.src;

public interface IRefill {
    void write();
    boolean isWorkable();
    Ink getInk();
    Nib getNib();
}