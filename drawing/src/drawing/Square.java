package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract  class Square extends Shape {
		int width;
		void CSquare(int x,int y,int w)
		{
			Type=drawing.ElementType.SQUARE;
			OrgX=100;//原点坐标
			OrgY=100;
			new Initialization();
			width=100;
		}
		void Draw(Graphics g)
		{
			g.drawRect(OrgX, OrgY, width, width);
			g.fillRect(OrgX, OrgY, width, width);
			g.setColor(BorderColor);
		
		}//绘制正方形
		


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
		}//获取图元形状参数
	


boolean IsMatched(Point pnt)//重载点pnt是否落在图元内
{
	if ((pnt.x >= OrgX - width / 2) && (pnt.x <= OrgX + width / 2) && (pnt.y >= OrgY - width / 2) && (pnt.y <= OrgY + width / 2))
		return true;
	else
		return false;
}

void SetValue(ElementType t,int x,int y,int w,int h)//设置正方形对象中的部分数据成员（与画笔和画刷无关的）的值
{Type=t; OrgX=x;OrgY=y;width=w;
}
void GetValue(ElementType t,int x,int y,int w,int h)//获取正方形对象中部分数据成员的值，通过引用参数将值传到实在参数
{t=Type;x=OrgX;y=OrgY;w=width;h=0;
}}
