package gitTest.one;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/3 9:19
 */
//当你要提交一个文件的代码时，
//另一个文件的GitTestTwo的代码与远程发生冲突
    /*
    * 1.先将GitTestOne的代码commit,然后pull，提示冲突。进行stash
    * 两个文件本地会怎样，远程会怎样
    * 然后 push
    * 两个文件本地会怎样，远程会怎样
    *
    * 2.先将GitTestOne的代码commit,然后pull，提示冲突。进行merge
    * 两个文件本地会怎样，远程会怎样
    * 然后push
    * 两个文件本地会怎样，远程会怎样
    * */
public class GitTestOne {
    //A内容做了修改，需要提交到远程
    //B的内容在远程已经被修改
}
