package demoday11;

/**
 * @Author: cpzh
 * @Date: 2018/3/30 13:45
 * TODO:
 */
public class SingleInstance {
    private static SingleInstance singleInstance;

    private SingleInstance(){}

    public SingleInstance getInstance(){
        if(singleInstance == null){
            singleInstance = new SingleInstance();
        }
        return singleInstance;
    }
}
