package com.mycompany.app;

/**
 * Stack
 */
public class Stack {

  final private int MAX_ARRAY = 10;
  private int top = 0;
  int[] data = new int[MAX_ARRAY];
  public Stack() { System.out.println("Stack contructor ..."); }

  public boolean StackEmpty() {
    if (top == 0) {
      return true;
    }
    return false;
  }

  public void Push(int value) {
    this.top = this.top + 1;
    data[this.top] = value;
  }

  public int Pop() {
    if (top == 0) {
      System.out.println("Overflow");
      return 0;
    }
    this.top = this.top - 1;
    return data[this.top + 1];
  }

  public void PrintStack() {
    for (int i = 0; i < this.data.length; i++) {
      System.out.printf("[%d]: %d ", i, this.data[i]);
    }
    System.out.println();
  }
}
