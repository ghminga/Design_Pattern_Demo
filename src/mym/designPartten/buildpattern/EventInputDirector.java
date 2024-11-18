package mym.designPartten.buildpattern;

/**
 * EventInput产品指导类(Director)
 * 指导创建对象，后续可简化
 * 特点：创建builder对象，让他执行build方法，最后返回Result
 */
public class EventInputDirector {
    EventInputBuilder eventInputBuilder = new EventInputConcreteBuilder();

    public EventInput buildFallEventInput() {
        eventInputBuilder.buildFallEventInput();
        return eventInputBuilder.getResult();
    }

    public EventInput buildDrugEventInput() {
        eventInputBuilder.buildDrugEventInput();
        return eventInputBuilder.getResult();
    }
}
