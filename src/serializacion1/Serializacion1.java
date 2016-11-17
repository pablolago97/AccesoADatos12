
package serializacion1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author plago-bergonpazos
 */
public class Serializacion1 {


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
       mclase obx1 = new mclase("ola",-7,2.7E10);
       mclase obx2 = new mclase();
       
       File serial = new File("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/serializacion1/src/serial.txt");
       serial.createNewFile();
       
       FileInputStream in1 = new FileInputStream(serial);
       FileOutputStream out1 = new FileOutputStream(serial);
       ObjectOutputStream out2 = new ObjectOutputStream(out1);
       ObjectInputStream in2 = new ObjectInputStream(in1);
       
       out2.writeObject(obx1);
       obx2 = (mclase) in2.readObject();
       System.out.println(obx2.toString());
       
    }
    
}
