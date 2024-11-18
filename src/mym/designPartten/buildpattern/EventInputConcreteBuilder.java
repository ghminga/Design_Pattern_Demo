package mym.designPartten.buildpattern;

/**
 * 具体实现类Builder
 */
public class EventInputConcreteBuilder extends EventInputBuilder{

    @Override
    public void buildFallEventInput() {
        eventInput.setEventName("跌倒不良事件");
        eventInput.setEventType("护理类");
        eventInput.setDescription("1");
    }

    @Override
    public void buildDrugEventInput() {
        eventInput.setEventName("药品不良事件");
        eventInput.setEventType("药品类");
        eventInput.setDescription("2");
    }
}
