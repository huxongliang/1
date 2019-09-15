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
		OrgX=x;//原点坐标
		OrgY=y;
		new Initialization();
		height=h;
		angle=a;
		text=t;
	}
	void Draw(Graphics g)//绘制
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
	void GetValue(ElementType type, int x, int y, int Width, int h,String s)//获取图元形状参数
	{
		type = Type;
		x = OrgX;
		y = OrgY;
		Width = angle;
		h = height;
		s = text;
	}

boolean IsMatched(Point pnt)//重载点pnt是否落在图元内
{
	if ((pnt.x >= OrgX ) && (pnt.y >= OrgY ))
		return true;
	else
		return false;
}

void SetValue(ElementType t,int x,int y,int w,int h)//设置正方形对象中的部分数据成员（与画笔和画刷无关的）的值
{
	Type=t; OrgX=x;OrgY=y;height=w;angle=h;
}
void GetValue(ElementType t,int x,int y,int w,int h)//获取正方形对象中部分数据成员的值，通过引用参数将值传到实在参数
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