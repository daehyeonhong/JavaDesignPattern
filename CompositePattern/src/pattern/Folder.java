package pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    public Folder(String name) {
        super(name);
    }

    List<Component> children = new ArrayList<>();

    boolean addComponent(Component component) {
        return children.add(component);
    }

    boolean removeComponent(Component component) {
        return children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }

}
