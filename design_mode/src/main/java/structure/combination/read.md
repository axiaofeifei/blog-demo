## 组合模式
抽象构件（Component）角色： 它的主要作用是为树叶构件和树枝构件声明公共接口，
                        并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；
                        在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。
                        （总的抽象类或接口，定义一些通用的方法，比如新增、删除）
树叶构件（Leaf）角色：       是组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。

树枝构件（Composite）角色 / 中间构件：是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。
                                它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法



## 组合模式的优缺点
### 优点：

可以清楚地定义分层次的复杂类型，表示对象的全部层次或者部分层次  ，它让客户端忽略了层次的差异，方便对整个层次经行控制。
客户端可以一致的使用一个组合模式或对单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端的代码。
在组合模式种增加新的容器构件和叶子构件都很方便，无需对现有类库进行任何修改，符合开闭原则。
为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和容器对象的递归组合可以形成复杂的树形机构，但对树形结构的控制却很简单。
### 缺点：

        在增加新的构件时就比较难咯。而且难以限定，有时候希望在一个容器种能有某些特定的对象，例如在某个文件夹只能有image或者gif等。这个就比较难以实现。