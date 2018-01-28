package assignment10;
/**
   This class demonstrates the tree class.
*/
public class TreeDemo
{
   public static void main(String[] args)
   {
      Tree t1 = new Tree(3);
      Tree t2 = new Tree(4);
      Tree t3 = new Tree(5);
      Tree t4 = new Tree(9);
      t1.addSubtree(t2);
      t1.addSubtree(t3);
      t1.addSubtree(t4);
      Tree t5 = new Tree(10);
      Tree t6 = new Tree(6);
      Tree t7 = new Tree(13);
      Tree t8 = new Tree(15);
      Tree t9 = new Tree(26);
      Tree t10 = new Tree(6);
      Tree t11 = new Tree(44);
      Tree t12 = new Tree(55);
      t2.addSubtree(t5);
      t2.addSubtree(t12);
      t3.addSubtree(t7);
      t3.addSubtree(t8);
      t3.addSubtree(t9);
      t3.addSubtree(t10);
      t3.addSubtree(t11);
      t4.addSubtree(t6);
      
      System.out.println("Size: " + t1.size());
      System.out.println(t1.bftravers());
   }
}