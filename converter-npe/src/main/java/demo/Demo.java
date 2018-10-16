package demo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class Demo {

    private int count;
    private boolean pass;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public void execute() {
        System.out.println(String.format("Count %s, Pass: %s", count, pass));
    }
}
