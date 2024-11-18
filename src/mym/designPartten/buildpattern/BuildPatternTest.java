package mym.designPartten.buildpattern;

/**
 * 建筑者模式测试
 */
public class BuildPatternTest {
    public static void main(String[] args) {
        // 不需要领导者
        EventInputBuilder eventInputBuilder = new EventInputConcreteBuilder();
        eventInputBuilder.buildFallEventInput();
        EventInput eventInput1 = eventInputBuilder.getResult();

        // 需要领导者
        EventInputDirector eventInputDirector = new EventInputDirector();
        EventInput eventInput2 = eventInputDirector.buildFallEventInput();
    }
}
