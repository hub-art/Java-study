package come.heima.test0606;

public abstract class ElecEquipment {
    protected String name;

    public ElecEquipment(String name) {
        this.name = name;
    }

    public abstract void work();
}
