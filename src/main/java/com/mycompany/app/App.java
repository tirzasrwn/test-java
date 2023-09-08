package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Stack s = new Stack();
    s.PrintStack();
    s.Pop();
    s.Push(85);
    s.Push(39);
    s.Push(55);
    s.Push(74);
    s.Push(23);
    s.PrintStack();
    s.Pop();
    s.PrintStack();
    s.Push(100);
    s.PrintStack();

    Queue q = new Queue();
    q.PrintQueue();
    q.Enqueue(32);
    q.Enqueue(65);
    q.Enqueue(86);
    q.Enqueue(56);
    q.Enqueue(49);
    q.PrintQueue();
    q.Dequeue();
    q.Enqueue(100);
    q.PrintQueue();
  }
}
