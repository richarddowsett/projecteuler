package util

abstract class Stack[T] {

  def push(v: T): Stack[T]

  def pop(): (T, Stack[T])

  def peek(): T

  def isEmpty: Boolean

}

object Stack {

  def apply[B](v: B): Stack[B] = Top(v, Nil())

  def empty[B]:Stack[B] = Nil()

}

case class Nil[B]() extends Stack[B] {
  override def push(v: B): Stack[B] = ???

  override def pop(): (B, Stack[B])  = ???

  override def peek(): B = ???

  override def isEmpty: Boolean = true
}

case class Top[B](value: B, next: Stack[B]) extends Stack[B] {
  override def push(v: B): Stack[B] = Top(v, this)

  override def peek(): B = value

  override def isEmpty: Boolean = false

  override def pop(): (B, Stack[B]) = value -> next
}
