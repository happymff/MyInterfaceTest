package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by mff on 2017/10/25.
 */

public class PropertiesHander {

    public static Properties properties = null;

    public static String getPropertiesValue(String key) {
        try {
            if (properties == null) {
                properties = new Properties();
                String path = "src/job_task.properties";
                FileInputStream in = new FileInputStream(new File(path));
                properties.load(in);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

}