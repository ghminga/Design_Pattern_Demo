package mym.designPartten.prototype;
/**
 * 原型模式(prototype)
 *特点:需要重复复制黏贴的时候，比起工厂模式，更适合使用原型模式
 *从一个物体再建立另外一个物体，不需要知道任何建立的细节 *
 *
 * 完成复制只需要以下两个步骤
 *1.设计一抽象类Prototype，者抽象类只负责(复制)
 *2.物件继承Prototype，并利用cloneable接口做clone
 *
 *应用实例:
 *1.需要复制和前面一模一样对象的场景
*2.0bject.clone()*
 *主要角色 *1.原型接口(PrototypeInterface):定义一个用于克
隆自身的接口，通常包括一个clone()方法。
 *2.具体原型类(Concrete Prototype):实现原型接口的具体类，负责实际的克隆操作。这个类需要实现 clone()方法，通常使用浅拷贝或深拷贝来复制自身。
 *3.客户端(Client)使用原型实例来创建新的对象。客户端调用原型对象的 clone()方法来创建新的对象，而不是直接使用构造函数 *
 * 实现步骤:
 *1.创建克降接□cloneable
 *2.创建原型类，然后里面加入clone方法
 * 3.实现clone方法，只需要对对象重新赋值
 * 4.client调用
 * 思路图解:
 * 原型<--实现原型(带上clone方法)<--(创建原型对象并调用clone方法)客户端
*/
public class OriginThought {
}
