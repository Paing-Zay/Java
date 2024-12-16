import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data_stream {
	public static void main(String[] args) throws IOException {
        String [] data = {"apple", "orange", "banana"};
        int [] price = {200, 300, 400};
        DataOutputStream out = null;
        DataInputStream in = null;
        try {
		 out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\B-10\\Downloads\\datasource\\out.txt")));
		 for (int x=0; x < data.length; x++) {
			 out.writeUTF(data[x]);
			 out.writeInt(price[x]);
		 }
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}

        try {
		 in = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\B-10\\Downloads\\datasource\\out.txt")));
		 for (int x=0; x < data.length; x++) {
			 System.out.println(in.readUTF() +"="+ in.readInt());

		 }
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			if (in!= null) {
				in.close();
			}
		}
	}
}
