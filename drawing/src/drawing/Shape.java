package drawing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

enum ElementType { NOTSET, SQUARE, RECTANGLE, CIRCLE, ELLIPSE, TRIANGLE, TEXT };
public abstract class Shape {
	 
	ElementType Type;//图元类型
	int OrgX;//原点坐标
	int OrgY;
	Color   BorderColor;//边界颜色
	int BorderType;//边界线型--实线、虚线、虚点线等
	int BorderWidth;//边界宽度
	Color  FillColor;//填充颜色
	int FillType;//填充类型--实心、双对角、十字交叉等
	abstract void Draw(Graphics c);//绘制图元
	abstract boolean IsMatched(int pnt);//判断点是否落在图形内部    
	abstract void Serialize(Object ar);//序列化
	abstract void SetValue(ElementType t,int x,int y,int width,int height);//设置数据成员
	abstract void GetValue(ElementType t,int x,int y,int width,int height);//获取数据成员的值
	void CShape()
	{
		Type = drawing.ElementType.NOTSET;
		OrgX = 0;
		OrgY = 0;
		SetPen (Color.black, BasicStroke.CAP_BUTT, 2);
		SetBrush(Color.blue, BasicStroke.CAP_BUTT);
	}
	void SetPen(Color bcolor,int btype,int bwidth) {
		BorderColor=bcolor;BorderType=btype;BorderWidth=bwidth;
	}
	void GetPen(Color bcolor,int btype,int bwidth) {
		bcolor=BorderColor;btype=BorderType;bwidth=BorderWidth;
	}
	void SetBrush(Color fcolor,int ftype) {
		FillColor=fcolor; 
		FillType=ftype;
	}
	void GetBrush(Color fcolor,int ftype) {
		fcolor=FillColor; 
		ftype=FillType;
	}
}