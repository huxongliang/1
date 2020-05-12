package behavioral.iterator;

public class TCLTelevision implements Television {
	private Object[] obj = {"虎虎生威","威风凛凛","凛若冰霜","霜气横秋","秋高气爽","爽心豁目","QQ","微信"}; 
	@Override
	public TVIterator creatIterator() {
		// TODO 自动生成的方法存根
		return new TCLIterator();
	}
	class TCLIterator implements TVIterator{
		private int currentIndex = 0;
		
		@Override
		public void setChannel(int i) {
			// TODO 自动生成的方法存根
			currentIndex = i;
		}

		@Override
		public void next() {
			// TODO 自动生成的方法存根
			if(currentIndex < obj.length)
				currentIndex++;
		}

		@Override
		public void previous() {
			// TODO 自动生成的方法存根
			if(currentIndex > 0)
				currentIndex--;
		}

		@Override
		public boolean isLast() {
			// TODO 自动生成的方法存根
			return currentIndex == obj.length;
		}

		@Override
		public Object currentChannel() {
			// TODO 自动生成的方法存根
			return obj[currentIndex];
		}

		@Override
		public boolean ifFirst() {
			// TODO 自动生成的方法存根
			return currentIndex == 0;
		}
		
	}
}

