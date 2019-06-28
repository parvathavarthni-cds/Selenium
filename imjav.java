import org.im4java.core.CompareCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;
import org.im4java.process.StandardStream;
 
import java.io.IOException;


public class imjav {
	public static void main(String args[]) throws IOException, InterruptedException, IM4JavaException
	{
		 CompareCmd compare = new CompareCmd();
		 
	        compare.setErrorConsumer(StandardStream.STDERR);
	        IMOperation cmpOp = new IMOperation();
	 
	        cmpOp.metric("mae");
	 
	        cmpOp.addImage("/home/parvathavarthini/Pictures/Screenshot from 2019-06-24 16-07-19.png");
	 
	        cmpOp.addImage("/home/parvathavarthini/Pictures/Screenshot from 2019-06-24 16-18-24.png");
	 
	        cmpOp.addImage("/home/parvathavarthini/Pictures/Screenshot7.png");
	 
	        compare.run(cmpOp);

	}

}
