import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class HelloOpenCV {

	public static void main(String[] args) {


		Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
		System.out.println("mat = \n" + mat.dump());
		System.out.println("HelloOpenCV!");
		System.out.println("Thank You Chanah!");

	}

}

