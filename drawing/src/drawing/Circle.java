package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Circle extends Shape {
		int radius;
		void CCircle(int x,int y,int r)
		{
			Type=drawing.ElementType.CIRCLE;
			OrgX=x;//ԭ������
			OrgY=y;
			new Initialization();
			radius=r;
		}
		void Draw(Graphics g)
		{
		   g.drawOval(OrgX, OrgY, radius, radius);
		   g.fillOval(OrgX, OrgY, radius, radius);
		   g.setColor(BorderColor);
		}//����Բ��
		

		void SetValue(int x, int y, int Width, int h, String s)
		{
			OrgX = x;
			OrgY = y;
			radius = Width;
		}
		void GetValue(ElementType type, int x, int y, int Width, int h, String s)
		{
			type = Type;
			x = OrgX;
			y = OrgY;
			Width = radius;
			h = 0;
			s = " ";
		}//��ȡͼԪ��״����
	



boolean IsMatched(Point pnt)//���ص�pnt�Ƿ�����ͼԪ��
{
	if ((pnt.x >= OrgX - radius / 2) && (pnt.x <= OrgX + radius / 2) && (pnt.y >= OrgY - radius / 2) && (pnt.y <= OrgY + radius / 2))
		return true;
	else
		return false;
}
void SetValue(ElementType t,int x,int y,int w,int h)//���������ζ����еĲ������ݳ�Ա���뻭�ʺͻ�ˢ�޹صģ���ֵ
{
	Type=t; OrgX=x;OrgY=y;radius=w;
}
void GetValue(ElementType t,int x,int y,int w,int h)//��ȡ�����ζ����в������ݳ�Ա��ֵ��ͨ�����ò�����ֵ����ʵ�ڲ���
{
	t=Type;x=OrgX;y=OrgY;w=radius;h=0;
}}