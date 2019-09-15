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
		OrgX=x;//原点坐标
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
	}//绘制椭圆形
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
	}//获取图元形状参数

boolean IsMatched(Point pnt)//重载点pnt是否落在图元内
{
	if ((pnt.x >= OrgX - radiusa / 2) && (pnt.x <= OrgX + radiusa / 2) && (pnt.y >= OrgY - radiusb / 2) && (pnt.y <= OrgY + radiusb / 2))
		return true;
	else
		return false;
}
void SetValue(ElementType t,int x,int y,int w,int h)//设置正方形对象中的部分数据成员（与画笔和画刷无关的）的值
{
	Type=t; OrgX=x;OrgY=y;radiusa=w;int radiusb = h;
}
void GetValue(ElementType t,int x,int y,int w,int h)//获取正方形对象中部分数据成员的值，通过引用参数将值传到实在参数
{
	t=Type;x=OrgX;y=OrgY;w=radiusa;h=radiusb;
}}