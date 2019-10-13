package FatherSerialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTool {
	/**
	 * ���������л����������ڱ����ļ���
	 * @param obj �����л��Ķ���
	 * @param fileName �洢�ı����ļ���
	 */
	public static void serialize(Object obj, String fileName) throws Exception{
		File file = new File(fileName); //�½�һ�������ļ������ڴ洢�����л��Ķ����ֽ���
		FileOutputStream output = new FileOutputStream(file); //�ļ������
		ObjectOutputStream oos = new ObjectOutputStream(output); //���������
		oos.writeObject(obj); //������д������������
		oos.flush(); //�ύ����������
		oos.close();
		output.close();
	}
	
	/**
	 * �ӱ����ļ��У�ͨ�������л���ȡ����
	 * @param fileName ���ش洢���л�������ļ�
	 * @return �����л���Ķ���
	 */
	public static Object deSerialize(String fileName) throws Exception{
		File file = new File(fileName); //��ȡ�洢�����ֽ����ı����ļ�
		FileInputStream input = new FileInputStream(file); //�����ļ�������
		ObjectInputStream ois = new ObjectInputStream(input); //�������������
		Object obj = ois.readObject(); //�Ӷ����������ж�ȡ����
		ois.close();
		input.close();
		return obj;
	}
	
	/**
	 * ��ӡָ���ļ����ļ���Ϣ�������ļ������ļ���С��
	 * @param fileName �����ļ���
	 */
	public static void printFileInfo(String fileName){
		File file = new File(fileName); //��ȡ�����ļ�
		
		System.out.println("-----------------------------");
		System.out.println("<FileName>:	" + fileName); //��ӡ�ļ���
		System.out.println("<FileSize>:	" + file.length() + " bytes"); //��ӡ�ļ���С
		System.out.println("-----------------------------");
	}
}