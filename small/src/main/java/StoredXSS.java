import javax.servlet.jsp.JspWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StoredXSS
{
     public static void doSomthing(JspWriter out, String fName) throws IOException {
		FileReader fileread = new FileReader(fName);
		BufferedReader bufread = new BufferedReader(fileread);
		String str;
		while((str = bufread.readLine()) != null) {
			out.print(str);
		}
     	fileread.close();
	 }
}