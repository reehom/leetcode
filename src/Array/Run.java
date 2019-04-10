package Array;

public class Run implements Runnable{

    private LockObject lObject;
    public void setlObject(LockObject lObject) {
        this.lObject = lObject;
    }
    public int id;
    public Run() {
    }
    public Run(int id) {
        this.id=id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    @Override
    public void run() {
        synchronized (lObject) {
            if(lObject.getValue()<lObject.maxvalue){
                System.out.println(lObject.getValue());
                lObject.setValue(lObject.getValue()+1);
            }
        }

    }

}
