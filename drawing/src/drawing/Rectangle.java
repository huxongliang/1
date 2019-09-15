package drawing;

//import java.awt.BasicStroke;
//import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Rectangle extends Shape{
		int width;
		int height;
		void CRectangle(int x,int y,int w,int h)
		{
			Type=drawing.ElementType.RECTANGLE;
			OrgX=x;//原点坐标 nbb                                                           
			OrgY=y;
			 //BorderColor=Color.cyan;//边界颜色
		//	BorderType=BasicStroke.CAP_BUTT;//边界线型--实线、虚线、虚点线等
		//	BorderWidth=1;//边界宽度
			//FillColor=Color.darkGray;//填充颜色
			//FillType=BasicStroke.CAP_BUTT;//填充类型--实心、双对角、十字交叉等
			new Initialization();
			width=w;
			height=h;
		}
		void Draw(Graphics g)
		{
			g.drawRect(OrgX, OrgY, width, height);
			g.fillRect(OrgY, OrgY, width, height);
			g.setColor(BorderColor);
			
		}//绘制长方形

		void SetValue(int x, int y, int Width, int h, String s)
		{
			OrgX = x;
			OrgY = y;
			width = Width;
			height = h;
		}
		void GetValue(ElementType type, int x, int y, int Width, int h, String s)
		{
			type = Type;
			x = OrgX;
			y = OrgY;
			Width = width;
			h = height;
			s = "hello";
		}//获取图元形状参数

	
boolean IsMatched(Point pnt)//重载点pnt是否落在图元内
{if((pnt.x >=OrgX-width/2)&&(pnt.x <=OrgX+width/2)&&(pnt.y>=OrgY- height/2)&&(pnt.y <=OrgY+height/2))
return true;
else	
	return false;


}
void SetValue(ElementType t,int x,int y,int w,int h)  //设置长方形对象中的部分数据成员（与画笔和画刷无关的）的值
{Type=t; OrgX=x;OrgY=y;width=w;height=h;
}
void GetValue(ElementType t,int x,int y,int w,int h) //获取长方形对象中部分数据成员的值，通过引用参数将值传到实在参数
{t=Type;x=OrgX;y=OrgY;w=width;h=height;
}}