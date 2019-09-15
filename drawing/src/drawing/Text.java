package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Text extends Shape {
	int height;
	int angle;
	String text;
	void CText(int x,int y,int h,int a,String t)
	{
		Type=drawing.ElementType.TEXT;
		OrgX=x;//ԭ������
		OrgY=y;
		new Initialization();
		height=h;
		angle=a;
		text=t;
	}
	void Draw(Graphics g)//����
	{
		g.drawString(text, OrgX, OrgY);
		g.setColor(BorderColor);	
	}
	
	void SetValue(int x, int y, int Width, int h, String s)
	{
		OrgX = x;
		OrgY = y;
		angle = Width;
		height = h;
		text = s;
	}
	void GetValue(ElementType type, int x, int y, int Width, int h,String s)//��ȡͼԪ��״����
	{
		type = Type;
		x = OrgX;
		y = OrgY;
		Width = angle;
		h = height;
		s = text;
	}

boolean IsMatched(Point pnt)//���ص�pnt�Ƿ�����ͼԪ��
{
	if ((pnt.x >= OrgX ) && (pnt.y >= OrgY ))
		return true;
	else
		return false;
}

void SetValue(ElementType t,int x,int y,int w,int h)//���������ζ����еĲ������ݳ�Ա���뻭�ʺͻ�ˢ�޹صģ���ֵ
{
	Type=t; OrgX=x;OrgY=y;height=w;angle=h;
}
void GetValue(ElementType t,int x,int y,int w,int h)//��ȡ�����ζ����в������ݳ�Ա��ֵ��ͨ�����ò�����ֵ����ʵ�ڲ���
{
	t=Type;x=OrgX;y=OrgY;h=0;w=height;h=angle;
}
void SetText(String T)
{
	text=T;
}

void GetText(String T)
{
	T=text;
}
}