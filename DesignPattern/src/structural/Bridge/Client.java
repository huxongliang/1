package structural.Bridge;

public class Client {
		public static void main(String[] args) {
			Color color;
			Pen pen;
			//根据配置文件确定颜色和笔大小
			color = (Color)XMLUtil.getBean("Color");
			pen = (Pen)XMLUtil.getBean("Pen");
			
			pen.setColor(color);
			pen.draw("鲜花");
		}
}
