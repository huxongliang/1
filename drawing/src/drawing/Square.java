package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract  class Square extends Shape {
		int width;
		void CSquare(int x,int y,int w)
		{
			Type=drawing.ElementType.SQUARE;
			OrgX=100;//ԭ������
			OrgY=100;
			new Initialization();
			width=100;
		}
		void Draw(Graphics g)
		{
			g.drawRect(OrgX, OrgY, width, width);
			g.fillRect(OrgX, OrgY, width, width);
			g.setColor(BorderColor);
		
		}//����������
		


		void SetValue(int x, int y, int Width, int h, String s)
		{
			OrgX = x;
			OrgY = y;
			width = Width;
		}
		void GetValue(ElementType type, int x, int y, int Width, int h, String s)
		{
			type = Type;
			x = OrgX;
			y = OrgY;
			Width = width;
			h = 0;
			s = " ";
		}//��ȡͼԪ��״����
	


boolean IsMatched(Point pnt)//���ص�pnt�Ƿ�����ͼԪ��
{
	if ((pnt.x >= OrgX - width / 2) && (pnt.x <= OrgX + width / 2) && (pnt.y >= OrgY - width / 2) && (pnt.y <= OrgY + width / 2))
		return true;
	else
		return false;
}

void SetValue(ElementType t,int x,int y,int w,int h)//���������ζ����еĲ������ݳ�Ա���뻭�ʺͻ�ˢ�޹صģ���ֵ
{Type=t; OrgX=x;OrgY=y;width=w;
}
void GetValue(ElementType t,int x,int y,int w,int h)//��ȡ�����ζ����в������ݳ�Ա��ֵ��ͨ�����ò�����ֵ����ʵ�ڲ���
{t=Type;x=OrgX;y=OrgY;w=width;h=0;
}}
