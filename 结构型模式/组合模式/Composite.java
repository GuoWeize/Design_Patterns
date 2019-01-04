package 组合模式;

public class Composite extends Component {
	
	public void operation () {
		throw new UnsupportedOperationException ("operation");
	}
	
	public void add (Component component) {}
	
	public void remove (Component component) {}
	
	public Component getChild (int index) {
		return null;
	}
	
}
