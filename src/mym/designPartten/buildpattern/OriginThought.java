package mym.designPartten.buildpattern;
/**
 *建造者模式
 *特点:盖房子，把材料封装起来，一个一个堆砌出结果
 * 优点:1.可读性和维护性 2.封装性好 3.灵活性高
 * 缺点:
 * 1.使用范围有限制，不然会出现不一样的builder，很麻烦
 * 2.增加复杂性 *
 * 主要角色
 * 1.具体建造者(concrete builder)实现建造者接口(builder)，负责把产品属性全部实现即可，即我创建一个普通对象，
 * 然后再把普通对象填充属性，让其变成一个修改过的对象，这个就是build的过程用实体类，并对其赋值
 * 2.导演者(Director)管理“builder"创造出来的实例的依赖关系和控制构建过程 实际开发可以不要这个类，直接由clint代替
 * 3.产品(product)构建复杂的产品，里面包含所有属性，生成我们要的对象 作用是实体类
 * 4.客户端(client)调用 builder，让其建造product调用builder
 *
 *本地用例:
 *不良事件，有跌倒不良事件，药品反应不良事件，器械不良事件
 *
 * 实际例子:Java包里的StringBuilder
 * 建造者模式使用步骤
 * 1.先创建builder，并决定里面要做的事比如得先新增一个不良事件对象然后给该对象*/
public class OriginThought {
}
