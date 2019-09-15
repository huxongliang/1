package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Ellipse extends Shape {
	private static int radiusa = 0;
	private static final int radiusb = 0;
	int width;
	int height;
	void CEllipse(int x,int y,int w,int h)
	{
		Type=drawing.ElementType.ELLIPSE;
		OrgX=x;//ԭ������
		OrgY=y;
		new Initialization();
		width=w;
		height=h;
	}
	void Draw(Graphics g)
	{
		g.drawOval(OrgX, OrgY, width, height);
		g.fillOval(OrgX, OrgY, width, height);
		g.setColor(BorderColor);
	}//������Բ��
	void SetValue(int x, int y, int w, int h, String s)
	{
		OrgX = x;
		OrgY = y;
		width = w;
		height = h;
	}
	void GetValue(ElementType type, int x, int y, int Width, int h, String s)
	{
		type = Type;
		x = OrgX;
		y = OrgY;
		Width = width;
		h = height;
		s = " ";
	}//��ȡͼԪ��״����

boolean IsMatched(Point pnt)//���ص�pnt�Ƿ�����ͼԪ��
{
	if ((pnt.x >= OrgX - radiusa / 2) && (pnt.x <= OrgX + radiusa / 2) && (pnt.y >= OrgY - radiusb / 2) && (pnt.y <= OrgY + radiusb / 2))
		return true;
	else
		return false;
}
void SetValue(ElementType t,int x,int y,int w,int h)//���������ζ����еĲ������ݳ�Ա���뻭�ʺͻ�ˢ�޹صģ���ֵ
{
	Type=t; OrgX=x;OrgY=y;radiusa=w;int radiusb = h;
}
void GetValue(ElementType t,int x,int y,int w,int h)//��ȡ�����ζ����в������ݳ�Ա��ֵ��ͨ�����ò�����ֵ����ʵ�ڲ���
{
	t=Type;x=OrgX;y=OrgY;w=radiusa;h=radiusb;
}}