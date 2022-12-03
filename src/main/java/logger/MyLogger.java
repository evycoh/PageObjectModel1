package logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyLogger {
    private MyLogger(){}
    private static boolean root=false;

    public static Logger getLogger(Class cls){
        if(!root){
            PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/main/resources/log4j.properties");
            root=false;
        }return Logger.getLogger(cls);
    }
}
