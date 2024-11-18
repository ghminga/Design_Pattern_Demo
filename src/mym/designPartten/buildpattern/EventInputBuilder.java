package mym.designPartten.buildpattern;

/**
 * 特点：作为建筑者模式的builder类，负责抽象创建各个类型的EventInput
 */
public abstract class EventInputBuilder {
    protected EventInput eventInput = new EventInput();

    // 创建跌倒不良事件
    public abstract void buildFallEventInput();

    // 创建药品不良事件
    public abstract void buildDrugEventInput();

    // 为创建的不良事件返回结果
    public EventInput getResult() {
        return eventInput;
    }
}
