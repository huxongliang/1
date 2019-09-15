package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Circle extends Shape {
		int radius;
		void CCircle(int x,int y,int r)
		{
			Type=drawing.ElementType.CIRCLE;
			OrgX=x;//原点坐标
			OrgY=y;
			new Initialization();
			radius=r;
		}
		void Draw(Graphics g)
		{
		   g.drawOval(OrgX, OrgY, radius, radius);
		   g.fillOval(OrgX, OrgY, radius, radius);
		   g.setColor(BorderColor);
		}//绘制圆形
		

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
		}//获取图元形状参数
	



boolean IsMatched(Point pnt)//重载点pnt是否落在图元内
{
	if ((pnt.x >= OrgX - radius / 2) && (pnt.x <= OrgX + radius / 2) && (pnt.y >= OrgY - radius / 2) && (pnt.y <= OrgY + radius / 2))
		return true;
	else
		return false;
}
void SetValue(ElementType t,int x,int y,int w,int h)//设置正方形对象中的部分数据成员（与画笔和画刷无关的）的值
{
	Type=t; OrgX=x;OrgY=y;radius=w;
}
void GetValue(ElementType t,int x,int y,int w,int h)//获取正方形对象中部分数据成员的值，通过引用参数将值传到实在参数
{
	t=Type;x=OrgX;y=OrgY;w=radius;h=0;
}}