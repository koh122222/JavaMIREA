package lab9;

class Project {
    private long INN;
    private String Name;
    public Project (String name , long inn){
        Name = name;
        INN = inn;
    }

    public long getINN() {
        return INN;
    }

    public void setINN(long INN) {
        this.INN = INN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

