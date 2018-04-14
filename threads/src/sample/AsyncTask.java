package sample;

import javafx.concurrent.Task;
public class AsyncTask extends Task {
    @Override
    protected Object call() throws Exception {
        while(true){
// code
            if(isCancelled()) break;
        }
        return null;
    }
}