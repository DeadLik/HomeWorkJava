package HomeWork_OOP1;

class Woman {
    private String name;
    private boolean allowsCabinetAccess;

    public Woman(String name, boolean allowsCabinetAccess) {
        this.name = name;
        this.allowsCabinetAccess = allowsCabinetAccess;
    }

    public String getName() {
        return name;
    }

    public boolean allowsToOpenCabinet() {
        return allowsCabinetAccess;
    }
}
