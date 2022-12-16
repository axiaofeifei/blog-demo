package tree_1;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TreeTest {

    static class Menu extends TreeNode<Menu> {
        Long id;
        Long parentId;
        String name;
        List<Menu> child;

        public Menu(Long id, String name, Long parentId) {
            this.id = id;
            this.name = name;
            this.parentId = parentId;
        }

        @Override
        public Long getParentId() {
            return parentId;
        }

        @Override
        public void setParentId(Long parentId) {
            this.parentId = parentId;
        }

        @Override
        public Long getId() {
            return id;
        }

        @Override
        public void setId(Long id) {
            this.id = id;
        }

        @Override
        public List<Menu> getChild() {
            return this.child;
        }

        @Override
        public void setChild(List<Menu> child) {
            this.child = child;
        }

    }

    /**
     * 测试用例
     */
    @Test
    public void testCode() {
        Menu treeNode1 = new Menu(1L, "广州", null);
        Menu treeNode2 = new Menu(2L, "深圳", null);

        Menu treeNode3 = new Menu(3L, "天河区", treeNode1.getId());
        Menu treeNode4 = new Menu(4L, "越秀区", treeNode1.getId());
        Menu treeNode5 = new Menu(5L, "黄埔区", treeNode1.getId());
        Menu treeNode6 = new Menu(6L, "石牌", treeNode3.getId());
        Menu treeNode7 = new Menu(7L, "百脑汇", treeNode6.getId());

        Menu treeNode8 = new Menu(8L, "南山区", treeNode2.getId());
        Menu treeNode9 = new Menu(9L, "宝安区", treeNode2.getId());
        Menu treeNode10 = new Menu(10L, "科技园", treeNode8.getId());

        List<Menu> list = new ArrayList<Menu>();
        list.add(treeNode1);
        list.add(treeNode2);
        list.add(treeNode3);
        list.add(treeNode4);
        list.add(treeNode5);
        list.add(treeNode6);
        list.add(treeNode7);
        list.add(treeNode8);
        list.add(treeNode9);
        list.add(treeNode10);

        List<Menu> trees = TreeUtil.listToTree(list);
        Menu children = TreeUtil.findChildren(trees.get(1), trees);

        System.out.println(children.getId());
        System.out.println(children.getChild());
        System.out.println(children.getParentId());


        //System.out.println(new Gson().toJson(trees));

    }

}