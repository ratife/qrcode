package mg.tife.qrcode;

import java.io.IOException;
import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("QRCODE Starting....");
    	String data = "https://www.facebook.com/watch";
    	String dest = "C:\\Users\\LENOVO\\eclipse-workspace\\qrcode\\dest.jpg";
        try {
			BitMatrix mat = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 600, 600);
			MatrixToImageWriter.writeToPath(mat, "jpg", Paths.get(dest));
			System.out.println("QRCODE created");
		} catch (WriterException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
