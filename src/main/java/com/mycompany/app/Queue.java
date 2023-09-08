package com.mycompany.app;

/**
 * Queue
 */
public class Queue {
  final private int MAX_ARRAY = 10;
  private int head = 4;
  private int tail = 4;
  private int[] data = new int[MAX_ARRAY];

  public Queue() { System.out.println("Queue constructor ..."); }

  public void Enqueue(int value) {
    data[tail] = value;
    if (tail == MAX_ARRAY) {
      tail = 0;
    } else {
      tail = tail + 1;
    }
  }

  public int Dequeue() {
    int x = data[head];
    if (head == MAX_ARRAY) {
      head = 0;
    } else {
      head = head + 1;
    }
    return x;
  }

  public void PrintQueue() {
    for (int i = 0; i < data.length; i++) {
      System.out.printf("[%d]: %d ", i, data[i]);
    }
    System.out.println();
  }
}
