package ss;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.*;



public class Spider {
	//�����ļ���·����
	private static String savefile = "E:\\test4.txt";
	//��ȡurl�ĵ�ַ ������Դ��ȡ��
	public static String getmessage(String url)  {
			URL url1;
			StringBuilder mes = new StringBuilder();
			  
			try {
				url1 = new URL(url);
				InputStream is = url1.openStream();
				//��UTF-8����ʽ��ȡ����
				BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
				String msg = null;
				while(null!=(msg = br.readLine())) {
					mes.append(msg);		
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//���ظ�url����ҳԴ������ݡ�
			return mes.toString();
			}
		
	public static void main(String[] args) throws Exception {
			String message = getmessage("https://www.w3.org/Consortium/Member/List");
			//System.out.println(message);
			//����������ʽ���Ի�ȡ��Ӧ��memberlist�����ݡ�
			Pattern p = Pattern.compile("class=\"member\">(\\D.+?)</a>");
			Matcher m = p.matcher(message);
			FileWriter fwriter = null;
			fwriter = new FileWriter(savefile);
			while(m.find()) {
				 //�ò�����1 д���ļ��С�
			     fwriter.write(m.group(1));
			     fwriter.append("\r\n");
				
			}
			//�����ļ�����
			fwriter.flush();
			//�ر��ļ�����
			fwriter.close();
			
			
			
			
		}
}