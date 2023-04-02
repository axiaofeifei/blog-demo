import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Ace on 2017/6/12.
 */
public class TreeNode {
    protected int id;
    protected int parentId;

    public Set<Integer> childrenSet = new HashSet<>();

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    List<TreeNode> children = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void add(TreeNode node){
        children.add(node);
    }
}
